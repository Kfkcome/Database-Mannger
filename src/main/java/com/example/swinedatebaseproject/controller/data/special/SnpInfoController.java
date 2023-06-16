package com.example.swinedatebaseproject.controller.data.special;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.swinedatebaseproject.domain.A1AHau;
import com.example.swinedatebaseproject.domain.A1Hau;
import com.example.swinedatebaseproject.domain.SnpInfo;
import com.example.swinedatebaseproject.response.ResponseResultCode;
import com.example.swinedatebaseproject.service.A1AHauService;
import com.example.swinedatebaseproject.service.A1HauService;
import com.example.swinedatebaseproject.service.A2HauService;
import com.example.swinedatebaseproject.service.SnpInfoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.comparator.Comparators;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.DataFormatException;

/**
 * @作者 DD
 * @创建时间 2023/6/6
 */
@SuppressWarnings("ALL")
@RestController
@RequestMapping("/snp")
public class SnpInfoController {
    SnpInfoService snpInfoService;

    A1AHauService a1AHauService;

    A1HauService a1HauService;

    public SnpInfoController(SnpInfoService snpInfoService, A1AHauService a1AHauService, A1HauService a1HauService) {
        this.snpInfoService = snpInfoService;
        this.a1AHauService = a1AHauService;
        this.a1HauService = a1HauService;
        geneInfo = new HashMap<>() {
            {
                put("Gheraf_", new GeneEntry("", a1AHauService, A1AHau.class));
                put("Gher_", new GeneEntry("", a1HauService, A1Hau.class));
            }
        };
    }

    // todo 补全
    private Map<String, GeneEntry> geneInfo;


    @GetMapping("/search-gene")
    public Object searchGene(@RequestParam String value) {

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
        responseResult.put("geneList", geneList);

        try {
            QueryWrapper<Object> geneQueryWrapper = new QueryWrapper<>();
            geneQueryWrapper.eq("feature", "gene");
            geneQueryWrapper.like("attributes", value);
            Object gene = geneService.list(geneQueryWrapper).stream().findFirst().get();
            Integer startValue = Integer.valueOf((String) startField.get(gene));
            Integer endValue = Integer.valueOf((String) endField.get(gene));
            responseResult.put("start", startValue);
            responseResult.put("end", endValue);

            QueryWrapper<SnpInfo> snpInfoQueryWrapper = new QueryWrapper<>();
            snpInfoQueryWrapper.ge("pos", startValue);
            snpInfoQueryWrapper.le("pos", endValue);
            List<SnpInfo> snpInfoList = snpInfoService.list(snpInfoQueryWrapper);
            responseResult.put("snpInfoList", snpInfoList);
        } catch (Exception e) {
            return ResponseResultCode.DATA_NOT_FOUND;
        }
        return responseResult;
    }

    @Data
    @AllArgsConstructor
    static class GeneEntry {
        String geneColumnNameInMainTable;
        IService geneService;
        Class geneClass;
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

    public static void main(String[] args) {

    }
}
