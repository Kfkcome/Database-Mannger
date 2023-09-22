package com.example.swinedatebaseproject.controller.data.special;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.swinedatebaseproject.constant.MyBatisConstants;
import com.example.swinedatebaseproject.domain.A1Hau;
import com.example.swinedatebaseproject.domain.A2Hau;
import com.example.swinedatebaseproject.domain.Ad1Hau;
import com.example.swinedatebaseproject.domain.SnpInfo;
import com.example.swinedatebaseproject.mapper.SnpInfoMapper;
import com.example.swinedatebaseproject.response.PageResult;
import com.example.swinedatebaseproject.response.ResponseResultCode;
import com.example.swinedatebaseproject.service.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.DataFormatException;

/**
 * @作者 DD
 * @创建时间 2023/6/6
 */
@SuppressWarnings("ALL")
@Slf4j
@RestController
@RequestMapping("/snp")
public class SnpInfoController {

    @Autowired
    SnpInfoMapper snpInfoMapper;

    @Autowired
    SnpInfoService snpInfoService;

    @Autowired
    A1HauService a1HauService;

    @Autowired
    A2HauService a2HauService;

    @Autowired
    Ad1HauService ad1HauService;

    @Autowired
    ArboreumCountService arboreumCountService;

    @Autowired
    HerbaceumCountService herbaceumCountService;

    @Autowired
    HirsutumCountService hirsutumCountService;
    private long snpInfoPageCount = 18796633l;
    private Map<String, GeneEntry> geneInfo;
    private Map<Integer, Integer> pageAndFirstId = new HashMap<>();

    @PostConstruct
    public void init() {
        geneInfo = new HashMap<>() {
            {
                // A1_HAU
                put("Gher", new GeneEntry("a1_hau", a1HauService, A1Hau.class));
                // A2_HAU
                put("Contig", new GeneEntry("a2_hau", a2HauService, A2Hau.class));
                // AD1_HAU
                put("Ghir", new GeneEntry("ad1_hau", ad1HauService, Ad1Hau.class));
            }
        };
    }

    @GetMapping("/search-gene-by-id")
    public Object searchGeneById(@RequestParam String value) {

        if (value.contains(".")) {
            return ResponseResultCode.NOT_GENE;
        }

        HashMap<String, Object> responseResult = new HashMap<>();

        String geneFeaturePrefix = geneInfo.keySet().stream().filter(key -> value.contains(key)).findFirst().orElseGet(() -> null);
        if (Objects.isNull(geneFeaturePrefix) || "".equals(geneFeaturePrefix)) {
            return ResponseResultCode.TABLE_ERROR;
        }

        IService geneService = geneInfo.get(geneFeaturePrefix).getGeneService();
        Class geneClass = geneInfo.get(geneFeaturePrefix).getGeneClass();

        Field startField = null;
        Field endField = null;
        try {
            startField = geneClass.getDeclaredField("start");
            endField = geneClass.getDeclaredField("end");
            startField.setAccessible(true);
            endField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            return ResponseResultCode.SERVER_ERROR;
        }

        QueryWrapper<Object> geneListQueryWrapper = new QueryWrapper<>();
        geneListQueryWrapper.in("feature", "EXON", "three_prime_UTR", "five_prime_UTR");
        geneListQueryWrapper.like("attributes", value);
        List geneList = geneService.list(geneListQueryWrapper);

        Field finalStartField = startField;
        geneList = geneList.stream().sorted((gene1, gene2) -> {
            try {
                Integer gene1StartValue = Integer.valueOf((String) finalStartField.get(gene1));
                Integer gene2StartValue = Integer.valueOf((String) finalStartField.get(gene2));
                if (gene1StartValue > gene2StartValue) {
                    return 1;
                } else if (gene1StartValue < gene2StartValue) {
                    return -1;
                } else {
                    return 0;
                }
            } catch (IllegalAccessException e) {
                return 0;
            }
        }).toList();
        responseResult.put("otherGeneList", geneList);

        try {
            QueryWrapper<Object> geneQueryWrapper = new QueryWrapper<>();
            geneQueryWrapper.eq("feature", "gene");
            geneQueryWrapper.like("attributes", value);
            Object gene = geneService.list(geneQueryWrapper).stream().findFirst().get();
            Integer startValue = Integer.valueOf((String) startField.get(gene));
            Integer endValue = Integer.valueOf((String) endField.get(gene));
            responseResult.put("mainGene", gene);

            QueryWrapper<SnpInfo> snpInfoQueryWrapper = new QueryWrapper<>();
            snpInfoQueryWrapper.ge("pos", startValue);
            snpInfoQueryWrapper.le("pos", endValue);
            List<SnpInfo> snpInfoList = snpInfoService.list(snpInfoQueryWrapper);
            if (snpInfoList.size() == 0) {
                return ResponseResultCode.SNP_ZERO;
            }
            responseResult.put("snpNum", snpInfoList.size());

            List finalGeneList = geneList;
            Field finalStartField1 = startField;
            Field finalEndField = endField;
            List<StartAndGroup> startAndEndList = new ArrayList<>() {
                {
                    for (Object o : finalGeneList) {
                        Integer start = Integer.valueOf((String) finalStartField1.get(o));
                        Integer end = Integer.valueOf((String) finalEndField.get(o));
                        add(new StartAndGroup(start, end));
                    }
                }
            };
            NumGroup numGroup = new NumGroup(0l, 0l, 0l, 0l);
            List<CompleteSnp> completeSnpList = snpInfoList.stream().map(snpInfo -> {
                CompleteSnp completeSnp = new CompleteSnp("", snpInfo);
                judgsSnpPos(numGroup, snpInfo.getPos(), startAndEndList, completeSnp);
                return completeSnp;
            }).toList();
            responseResult.put("snpInfoList", completeSnpList);
            responseResult.put("lowNum", numGroup.getLowNum());
            responseResult.put("midNum", numGroup.getMiddleNum());
            responseResult.put("highNum", numGroup.getHighNum());
            responseResult.put("modifierNum", numGroup.getModiNum());

        } catch (Exception e) {
            return ResponseResultCode.SERVER_ERROR;
        }
        return responseResult;
    }

    @Data
    @AllArgsConstructor
    static class CompleteSnp {
        String flag;
        SnpInfo snpInfo;
    }

    @Data
    @AllArgsConstructor
    static class NumGroup {
        Long modiNum;
        Long lowNum;
        Long middleNum;
        Long highNum;
    }

    /**
     * @param value
     * @param chromosome
     * @param current
     * @return
     */
    @GetMapping("/search-gene-by-region")
    public Object searchGeneByRegion(@RequestParam String value, @RequestParam String chromosome, @RequestParam int current) {
        if (!value.contains("_")) {
            log.info("缺失_");
            return ResponseResultCode.ERROR_CONDITION;
        }
        String[] strings = value.split("_");
        List<Integer> startAndEnd = null;
        try {
            startAndEnd = Arrays.stream(strings).map(Integer::valueOf).toList();
            if (startAndEnd.size() != 2) {
                log.info("数量不为2");
                return ResponseResultCode.ERROR_CONDITION;
            }
            if (startAndEnd.get(0) > startAndEnd.get(1)) {
                log.info("边界大小关系错误");
                return ResponseResultCode.ERROR_CONDITION;
            }
            if (startAndEnd.get(1) - startAndEnd.get(0) > 10000) {
                return ResponseResultCode.ERROR_CONDITION;
            }
        } catch (Exception e) {
            log.info("输入值非数字");
            return ResponseResultCode.ERROR_CONDITION;
        }

        QueryWrapper wrapper = new QueryWrapper<>();
        wrapper.eq("feature", "gene");
        // 将输入参数转换为字符串类型
        // 由于列类型为字符串类型 若将数值类型的输入参数
        wrapper.ge("start", startAndEnd.get(0));
        wrapper.le("end", startAndEnd.get(1));
        wrapper.eq("chromosome", chromosome);

        GeneEntry geneEntry = null;
        for (String key : geneInfo.keySet()) {
            if (chromosome.contains(key)) {
                geneEntry = geneInfo.get(key);
                break;
            }
        }
        if (Objects.isNull(geneEntry)) {
            return ResponseResultCode.DATA_NOT_FOUND;
        }

        Class geneClass = geneEntry.getGeneClass();
        IService geneService = geneEntry.getGeneService();
        String tableName = geneEntry.getTabelName();

        List list = geneService.list(wrapper);
        List resultList = list.stream()
                .map(gene -> {
                    try {
                        Field startField = geneClass.getDeclaredField("start");
                        Field endField = geneClass.getDeclaredField("end");
                        Field attributesField = geneClass.getDeclaredField("attributes");
                        startField.setAccessible(true);
                        endField.setAccessible(true);
                        attributesField.setAccessible(true);
                        Integer start = Integer.valueOf((String) startField.get(gene));
                        Integer end = Integer.valueOf((String) endField.get(gene));
                        QueryWrapper<SnpInfo> snpInfoQueryWrapper = new QueryWrapper<>();
                        snpInfoQueryWrapper.ge("pos", start);
                        snpInfoQueryWrapper.le("pos", end);
                        List<SnpInfo> snpInfoList = snpInfoService.list(snpInfoQueryWrapper);
                        long snpNum = (long) snpInfoList.size();
                        String attributes = (String) attributesField.get(gene);
                        String replacedAttributes = attributes.replace("ID=", "").replace(";", "");
                        QueryWrapper<Object> selectFeatureNotGeneWrapper = Wrappers.query().ne("feature", "mRNA").ne("attributes", attributes).like("attributes", replacedAttributes);
                        List featureNotGeneList = geneService.list(selectFeatureNotGeneWrapper);
                        featureNotGeneList.stream().forEach(System.out::println);
                        List<StartAndGroup> startAndEndList = new ArrayList<>() {
                            {
                                for (Object o : featureNotGeneList) {
                                    Integer start = Integer.valueOf((String) startField.get(o));
                                    Integer end = Integer.valueOf((String) endField.get(o));
                                    add(new StartAndGroup(start, end));
                                }
                            }
                        };
                        startAndEndList.forEach(System.out::println);
                        NumGroup numGroup = new NumGroup(0l, 0l, 0l, 0l);
                        for (SnpInfo snpInfo : snpInfoList) {
                            judgsSnpPos(numGroup, snpInfo.getPos(), startAndEndList, snpInfo);
                        }
                        return new MainGeneAndOtherInfo(gene, tableName, snpNum, numGroup.getLowNum(), numGroup.getMiddleNum(), numGroup.getHighNum(), numGroup.getModiNum());
                    } catch (NoSuchFieldException | IllegalAccessException e) {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .toList();

        return getPageFromCacheResult(current, resultList);
    }

    private void judgsSnpPos(NumGroup numGroup, Integer pos, List<StartAndGroup> startAndEndList, SnpInfo snpInfo) {
        for (StartAndGroup startAndGroup : startAndEndList) {
            if (pos >= startAndGroup.getStart() & pos <= startAndGroup.getEnd()) {
                Double freq = Double.valueOf(snpInfo.getFreq());
                if (0 < freq & freq <= 0.03277254) {
                    numGroup.setLowNum(numGroup.getLowNum() + 1);
                } else if (0.03277254 < freq & freq <= 0.06554508) {
                    numGroup.setMiddleNum(numGroup.getMiddleNum() + 1);
                } else {
                    numGroup.setHighNum(numGroup.getHighNum() + 1);
                }
                return;
            }
        }
        numGroup.setModiNum(numGroup.getModiNum() + 1);
    }

    private void judgsSnpPos(NumGroup numGroup, Integer pos, List<StartAndGroup> startAndEndList, CompleteSnp completeSnp) {
        for (StartAndGroup startAndGroup : startAndEndList) {
            if (pos >= startAndGroup.getStart() & pos <= startAndGroup.getEnd()) {
                Double freq = Double.valueOf(completeSnp.getSnpInfo().getFreq());
                if (0 < freq & freq <= 0.03277254) {
                    completeSnp.setFlag("low");
                    numGroup.setLowNum(numGroup.getLowNum() + 1);
                } else if (0.03277254 < freq & freq <= 0.06554508) {
                    completeSnp.setFlag("mid");
                    numGroup.setMiddleNum(numGroup.getMiddleNum() + 1);

                } else {
                    completeSnp.setFlag("high");
                    numGroup.setHighNum(numGroup.getHighNum() + 1);
                }
                return;
            }
        }
        completeSnp.setFlag("modi");
        numGroup.setModiNum(numGroup.getModiNum() + 1);
    }

    @Getter
    @AllArgsConstructor
    @ToString
    static class StartAndGroup {
        Integer start;
        Integer end;

    }

    private Object getPageFromCacheResult(int current, List<Object> result) {
        int pageSize;
        if (result.size() == 0) {
            return ResponseResultCode.DATA_NOT_FOUND;
        } else if (result.size() <= MyBatisConstants.PAGE_SIZE) {
            pageSize = 1;
        } else {
            int size = result.size();
            pageSize = size % MyBatisConstants.PAGE_SIZE == 0 ? size / MyBatisConstants.PAGE_SIZE : size / MyBatisConstants.PAGE_SIZE + 1;
        }

        List<Object> data;
        if (current > pageSize) {
            return ResponseResultCode.ERRPR_PAGE;
        } else if (current == pageSize) {
            data = result.subList((current - 1) * MyBatisConstants.PAGE_SIZE, result.size());
        } else {
            data = result.subList((current - 1) * MyBatisConstants.PAGE_SIZE, current * MyBatisConstants.PAGE_SIZE);
        }

        int rowSize = result.size();

        return new PageResult(pageSize, 1, rowSize, data);
    }

    @GetMapping("/page-count")
    public Object getPageCount() {
        if (snpInfoPageCount == -1l) {
            long count = snpInfoService.count();
            snpInfoPageCount = count % MyBatisConstants.PAGE_SIZE == 0 ? count / MyBatisConstants.PAGE_SIZE : count / MyBatisConstants.PAGE_SIZE + 1;
        }
        return snpInfoPageCount;
    }

    @GetMapping("/page/{current}")
    public Object getPage(@PathVariable int current) {
        return getPageV2(current);
    }

    private Object getPageV1(int current) {
        Integer id = pageAndFirstId.get(current);
        if (Objects.nonNull(id)) {
            LambdaQueryWrapper<SnpInfo> wrapper = Wrappers.<SnpInfo>lambdaQuery().ge(SnpInfo::getSnpId, id)
                    .last("limit " + MyBatisConstants.PAGE_SIZE);
            return snpInfoService.list(wrapper);
        }

        int offset = (current - 1) * MyBatisConstants.PAGE_SIZE;
        if (offset < 0) {
            return ResponseResultCode.ERRPR_PAGE;
        }
        List<SnpInfo> snpInfos = snpInfoMapper.selectPageV1(offset, MyBatisConstants.PAGE_SIZE);
        Integer firstId = snpInfos.get(0).getSnpId();
        pageAndFirstId.putIfAbsent(current, firstId);
        return snpInfos;
    }

    private Object getPageV2(int current) {
        int offset = (current - 1) * MyBatisConstants.PAGE_SIZE;
        LambdaQueryWrapper<SnpInfo> wrapper = Wrappers.<SnpInfo>lambdaQuery()
                .select(SnpInfo::getSnpId)
                .orderBy(true, true, SnpInfo::getSnpId)
                .last("limit " + offset + "," + MyBatisConstants.PAGE_SIZE);
        List<SnpInfo> snpInfoList = snpInfoService.list(wrapper);
        List<Integer> idList = snpInfoList.stream().map(SnpInfo::getSnpId).toList();
        LambdaQueryWrapper<SnpInfo> queryWrapper = Wrappers.<SnpInfo>lambdaQuery()
                .in(idList.stream().count() != 0, SnpInfo::getSnpId, idList);
        return snpInfoService.list(queryWrapper);
    }

    private Object getPageV3(int current) {
        Page<SnpInfo> page = new Page<>(current, MyBatisConstants.PAGE_SIZE);
        return snpInfoService.page(page).getRecords();
    }


    @GetMapping("/select-table-info")
    public Object getOtherData(@RequestParam String chrom, @RequestParam Integer pos) {
        QueryWrapper wrapper = new QueryWrapper<>();
        wrapper.eq("CHROM", chrom);
        wrapper.eq("POS", pos);
        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("arboreumCountRecord", arboreumCountService.list(wrapper));
        resultMap.put("herbaceumCountRecord", herbaceumCountService.list(wrapper));
        resultMap.put("hirsutumCountRecord", hirsutumCountService.list(wrapper));
        return resultMap;
    }

    @Data
    @AllArgsConstructor
    static class GeneEntry {
        String tabelName;
        IService geneService;
        Class geneClass;
    }

    @Data
    @AllArgsConstructor
    static class MainGeneAndOtherInfo {
        Object gene;
        String tableName;
        Long spnNum;
        Long lowNum;
        Long midNum;
        Long highNum;
        Long modifierNum;
    }

    public void doOperation() throws DataFormatException {
        throw new DataFormatException();
    }

    public void postAfterDoOperation() {
        try {
            doOperation();
        } catch (DataFormatException e) {
            throw new RuntimeException(e);
        }
    }

    private final ExecutorService THREAD_POOL = new ThreadPoolExecutor(8, 16, 30 * 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1024));

    private static class MapTask implements Runnable {
        private IService service;

        private QueryWrapper queryWrapper;

        private Map<String, Object> map;

        private String tableName;

        private AtomicInteger groupTaskFlag;

        private QueryWrapper constructWrapper(String chrom, int pos) {
            return Wrappers.query().eq("CHROM", chrom).eq("POS", pos);
        }

        private static final List<String> regions = new ArrayList<>() {
            {
                add("Asia");
                add("Africa");
                add("SouthAmerica");
                add("Other");
                add("NorthAmerica");
                add("Europe");
                add("Oceania");
            }
        };

        private String constructTableName() {
            String serviceName = service.getClass().getSimpleName();
            for (String region : regions) {
                if (serviceName.contains(region)) {
                    return region;
                }
            }
            return serviceName;
        }

        public MapTask(IService service, String chrom, int pos, Map<String, Object> map, AtomicInteger groupTaskFlag) {
            this.service = service;
            this.map = map;
            queryWrapper = constructWrapper(chrom, pos);
            tableName = constructTableName();
            this.groupTaskFlag = groupTaskFlag;
        }

        @Override
        public void run() {
            Object data = service.getOne(queryWrapper);
            if (Objects.nonNull(data)) {
                map.put(tableName, data);
            }
            groupTaskFlag.incrementAndGet();

        }
    }

    @Autowired
    AfricaCountService africaCountService;

    @Autowired
    AsiaCountService asiaCountService;

    @Autowired
    EuropeCountService europeCountService;

    @Autowired
    NorthAmericaCountService northAmericaCountService;

    @Autowired
    OceaniaCountService oceaniaCountService;

    @Autowired
    OtherCountService otherCountService;

    @Autowired
    SouthAmericaCountService southAmericaCountService;

    private static final Map<String, Object> regions = new HashMap<>();

    @RequestMapping("/map-data")
    public Object getMapData(@RequestParam String chrom, @RequestParam int pos) {
        AtomicInteger groupTaskFlag = new AtomicInteger(0);
        HashMap<String, Object> mapData = new HashMap<>();
        long startTime = System.currentTimeMillis();
        THREAD_POOL.execute(new MapTask(africaCountService, chrom, pos, mapData, groupTaskFlag));
        THREAD_POOL.execute(new MapTask(asiaCountService, chrom, pos, mapData, groupTaskFlag));
        THREAD_POOL.execute(new MapTask(europeCountService, chrom, pos, mapData, groupTaskFlag));
        THREAD_POOL.execute(new MapTask(northAmericaCountService, chrom, pos, mapData, groupTaskFlag));
        THREAD_POOL.execute(new MapTask(otherCountService, chrom, pos, mapData, groupTaskFlag));
        THREAD_POOL.execute(new MapTask(southAmericaCountService, chrom, pos, mapData, groupTaskFlag));
        THREAD_POOL.execute(new MapTask(oceaniaCountService, chrom, pos, mapData, groupTaskFlag));
        while (true) {
            if (groupTaskFlag.get() == 7) {
                if (mapData.size() == 0) {
                    return ResponseResultCode.DATA_NOT_FOUND;
                }
                return mapData;
            }
            if (System.currentTimeMillis() - startTime >= 10 * 1000) {
                return regions;
            }
        }
    }

    private void test() {

    }


}
