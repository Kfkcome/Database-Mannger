package com.example.swinedatebaseproject.controller.data.special;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.swinedatebaseproject.domain.A1Hau;
import com.example.swinedatebaseproject.domain.SnpInfo;
import com.example.swinedatebaseproject.response.ResponseResultCode;
import com.example.swinedatebaseproject.service.A1HauService;
import com.example.swinedatebaseproject.service.A2HauService;
import com.example.swinedatebaseproject.service.SnpInfoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    SnpInfoService snpInfoService;

    @Autowired
    A1HauService a1HauService;

    @Autowired
    A2HauService a2HauService;

    // todo 补全
    private Map<String, GeneEntry> geneInfo = new HashMap<>() {
        {
            put("Gheraf", new GeneEntry("", a1HauService, A1Hau.class));
        }
    };

    @GetMapping("/search-gene")
    public Object searchGene(@RequestParam String value) {

        HashMap<String, Object> responseResult = new HashMap<>();

        String geneFeaturePrefix = geneInfo.keySet().stream().filter(key -> value.contains(key)).findFirst().get();
        if (Objects.isNull(geneFeaturePrefix) || "".equals(geneFeaturePrefix)) {
            return ResponseResultCode.DATA_NOT_FOUND;
        }

        IService geneService = geneInfo.get(geneFeaturePrefix).getGeneService();
        Class geneClass = geneInfo.get(geneFeaturePrefix).getGeneClass();

        QueryWrapper<Object> geneListQueryWrapper = new QueryWrapper<>();
        geneListQueryWrapper.in("feature", "EXON", "three_prime_UTR", "five_prime_UTR");
        geneListQueryWrapper.like("attributes", value);
        List geneList = geneService.list(geneListQueryWrapper);
        responseResult.put("geneList", geneList);

        QueryWrapper<Object> geneQueryWrapper = new QueryWrapper<>();
        geneQueryWrapper.eq("feature", "gene");
        geneQueryWrapper.like("attributes", value);
        Object gene = geneService.list(geneQueryWrapper).stream().findFirst().get();

        try {
            Field startField = geneClass.getDeclaredField("start");
            Field endField = geneClass.getDeclaredField("end");
            Integer startValue = Integer.valueOf((String) startField.get(gene));
            Integer endValue = Integer.valueOf((String) endField.get(gene));

            QueryWrapper<SnpInfo> snpInfoQueryWrapper = new QueryWrapper<>();
            snpInfoQueryWrapper.ge("pos", startValue);
            snpInfoQueryWrapper.le("pos", endValue);
            List<SnpInfo> snpInfoList = snpInfoService.list(snpInfoQueryWrapper);
            responseResult.put("snpInfoList", snpInfoList);
        } catch (NoSuchFieldException | IllegalAccessException e) {
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
