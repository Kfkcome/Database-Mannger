package com.example.swinedatebaseproject.controller.data.special;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.swinedatebaseproject.constant.MyBatisConstants;
import com.example.swinedatebaseproject.domain.*;
import com.example.swinedatebaseproject.response.PageResult;
import com.example.swinedatebaseproject.response.ResponseResultCode;
import com.example.swinedatebaseproject.service.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.util.*;
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

    private long snpInfoCount = -1l;

    @PostConstruct
    public void init() {
        geneInfo = new HashMap<>() {
            {
                // A1_HAU
                put("Gher_", new GeneEntry("", a1HauService, A1Hau.class));
                // A2_HAU
                put("Garb_", new GeneEntry("", a2HauService, A2Hau.class));
                // AD1_HAU
                put("Ghir_", new GeneEntry("",ad1HauService , Ad1Hau.class));
            }
        };
    }

    // todo 补全
    private Map<String, GeneEntry> geneInfo;

    private List<Object> cacheResult = new ArrayList<>();
    protected int cachePageSize;


    @GetMapping("/search-gene-by-id")
    public Object searchGeneById(@RequestParam String value) {

        HashMap<String, Object> responseResult = new HashMap<>();

        String geneFeaturePrefix = geneInfo.keySet().stream().filter(key -> value.contains(key)).findFirst().orElseGet(()->null);
        if (Objects.isNull(geneFeaturePrefix) || "".equals(geneFeaturePrefix)) {
            return ResponseResultCode.DATA_NOT_FOUND;
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
            return ResponseResultCode.DATA_NOT_FOUND;
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
            responseResult.put("snpInfoList", snpInfoList);
            responseResult.put("snpNum", snpInfoList.size());

            long lowNum = snpInfoList.stream().filter(snpInfo -> {
                Double freq = Double.valueOf(snpInfo.getFreq());
                return 0 < freq & freq <= 0.03277254;
            }).count();
            long midNum = snpInfoList.stream().filter(snpInfo -> {
                Double freq = Double.valueOf(snpInfo.getFreq());
                return 0.03277254 < freq & freq <= 0.06554508;
            }).count();
            long highNum = snpInfoList.stream().filter(snpInfo -> {
                Double freq = Double.valueOf(snpInfo.getFreq());
                return 0.06554508 < freq & freq <= 0.098317627;
            }).count();
            responseResult.put("lowNum",lowNum);
            responseResult.put("midNum", midNum);
            responseResult.put("highNum", highNum);
            responseResult.put("modifierNum", 0);

        } catch (Exception e) {
            return ResponseResultCode.DATA_NOT_FOUND;
        }

        return responseResult;
    }

    @GetMapping("/search-gene-by-region")
    public Object searchGeneByRegion(@RequestParam String value) {
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
            if(startAndEnd.get(0)>startAndEnd.get(1)){
                log.info("边界大小关系错误");
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

        cacheResult = geneInfo.values().stream()
                .flatMap(geneEntry -> {
                    Class geneClass = geneEntry.getGeneClass();
                    IService geneService = geneEntry.getGeneService();
                    List list = geneService.list(wrapper);
                    return list.stream()
                            .map(gene -> {
                                try {
                                    Field startField = geneClass.getDeclaredField("start");
                                    Field endField = geneClass.getDeclaredField("end");
                                    startField.setAccessible(true);
                                    endField.setAccessible(true);
                                    Integer start = Integer.valueOf((String) startField.get(gene));
                                    Integer end = Integer.valueOf((String) endField.get(gene));
                                    QueryWrapper<SnpInfo> snpInfoQueryWrapper = new QueryWrapper<>();
                                    snpInfoQueryWrapper.ge("pos", start);
                                    snpInfoQueryWrapper.le("pos", end);
                                    List<SnpInfo> snpInfoList = snpInfoService.list(snpInfoQueryWrapper);
                                    long snpNum = (long) snpInfoList.size();
                                    long lowNum = snpInfoList.stream().filter(snpInfo -> {
                                        Double freq = Double.valueOf(snpInfo.getFreq());
                                        return 0 < freq & freq <= 0.03277254;
                                    }).count();
                                    long midNum = snpInfoList.stream().filter(snpInfo -> {
                                        Double freq = Double.valueOf(snpInfo.getFreq());
                                        return 0.03277254 < freq & freq <= 0.06554508;
                                    }).count();
                                    long highNum = snpInfoList.stream().filter(snpInfo -> {
                                        Double freq = Double.valueOf(snpInfo.getFreq());
                                        return 0.06554508 < freq & freq <= 0.098317627;
                                    }).count();
                                    return new MainGeneAndOtherInfo(gene, snpNum, lowNum, midNum, highNum, 0l);
                                } catch (NoSuchFieldException | IllegalAccessException e) {
                                    return null;
                                }
                            })
                            .filter(Objects::nonNull);
                })
                .toList();
        if (cacheResult.size() == 0) {
            return ResponseResultCode.DATA_NOT_FOUND;
        } else if (cacheResult.size() <= MyBatisConstants.PAGE_SIZE) {
            cachePageSize = 1;
        } else {
            int size = cacheResult.size();
            cachePageSize = size % MyBatisConstants.PAGE_SIZE == 0 ? size / MyBatisConstants.PAGE_SIZE : size / MyBatisConstants.PAGE_SIZE + 1;
        }
        return getPageFromCacheResult(1);
    }

    private PageResult getPageFromCacheResult(int current) {
        List<Object> data;
        if (current == cachePageSize) {
            data = cacheResult.subList((current - 1) * MyBatisConstants.PAGE_SIZE, cacheResult.size() - 1);
        } else {
            data = cacheResult.subList((current - 1) * MyBatisConstants.PAGE_SIZE, current * MyBatisConstants.PAGE_SIZE - 1);
        }
        return new PageResult(cachePageSize, 1, data);
    }

    @GetMapping("/search-gene-by-region/page/{current}")
    public Object searchGeneByRegionPage(@PathVariable int current) {
        if (current > cachePageSize) {
            return ResponseResultCode.ERRPR_PAGE;
        }
        return getPageFromCacheResult(current);
    }

    @GetMapping("/page-count")
    public Object getPageCount(){
        if (snpInfoCount == -1l) {
            long count = snpInfoService.count();
            snpInfoCount = count % MyBatisConstants.PAGE_SIZE == 0 ? count : count + 1;
        }
        return snpInfoCount;
    }

    @GetMapping("/page/{current}")
    public Object getPage(@PathVariable Long current){
        Page<SnpInfo> page = null;
        if (snpInfoCount != -1l) {
            page = new Page<>(current, MyBatisConstants.PAGE_SIZE, snpInfoCount);
        } else {
            page = new Page<>(current, MyBatisConstants.PAGE_SIZE);
        }
        QueryWrapper wrapper = Wrappers.query().last("limit " + (current - 1) * MyBatisConstants.PAGE_SIZE + "," + MyBatisConstants.PAGE_SIZE);
        return snpInfoService.list(wrapper);
    }

    @GetMapping("/select-other-data")
    public Object getOtherData(@RequestParam String chrom,@RequestParam Integer pos) {
        QueryWrapper wrapper = new QueryWrapper<>();
        wrapper.eq("CHROM", chrom);
        wrapper.eq("POS", pos);
        return new ArrayList<>() {
            {
                addAll(arboreumCountService.list(wrapper));
                addAll(herbaceumCountService.list(wrapper));
                addAll(hirsutumCountService.list(wrapper));
            }
        };
    }

    @Data
    @AllArgsConstructor
    static class GeneEntry {
        String geneColumnNameInMainTable;
        IService geneService;
        Class geneClass;
    }

    @Data
    @AllArgsConstructor
    static class MainGeneAndOtherInfo{
        Object gene;
        Long spnNum;
        Long lowNum;
        Long midNum;
        Long highNum;
        Long modifierNum;

        /**
         * low mid high modifier
         */

    }


    public void doOperation() throws DataFormatException{
        throw new DataFormatException();
    }

    public void postAfterDoOperation() {
        try {
            doOperation();
        } catch (DataFormatException e) {
            throw new RuntimeException(e);
        }
    }


}
