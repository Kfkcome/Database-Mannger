package com.example.swinedatebaseproject.controller.data.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.swinedatebaseproject.constant.MyBatisConstants;
import com.example.swinedatebaseproject.controller.data.CommonController;
import com.example.swinedatebaseproject.domain.A1AHau;
import com.example.swinedatebaseproject.domain.A1Hau;
import com.example.swinedatebaseproject.response.ResponseResult;
import com.example.swinedatebaseproject.domain.Orthogroups5genomesPlus;
import com.example.swinedatebaseproject.service.A1AHauService;
import com.example.swinedatebaseproject.service.Orthogroups5genomesPlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @作者 DD
 * @创建时间 2023/3/6
 */

@SuppressWarnings("ALL")
@RestController
@RequestMapping(value = "orthogroups5genomesPlus", method = {RequestMethod.DELETE, RequestMethod.GET, RequestMethod.POST})
public class Orthogroups5genomesPlusController extends CommonController<Orthogroups5genomesPlus> {

    @Autowired
    A1AHauService a1AHauService;


    @Autowired
    public Orthogroups5genomesPlusController(Orthogroups5genomesPlusService service) {
        super("cds_name");
        this.service = service;
    }

    @GetMapping("/fieldNames")
    @Override
    public ResponseResult getFieldNames() {
        return getFieldNamesActual();
    }

    @GetMapping("/id/{id}")
    @Override
    public ResponseResult getSingleDataById(@PathVariable Integer id) {
        return getSingleDataByIdActual(id);
    }

    @GetMapping("/all")
    @Override
    public ResponseResult getAllData() {
        return getAllDataActual();
    }

    @GetMapping("/page/{current}")
    @Override
    public ResponseResult getDataByPage(@PathVariable Integer current) {
        return getDataByPageActual(current);
    }

    @GetMapping("/page-count")
    @Override
    public ResponseResult getPageCount() {
        return getPageCountActual();
    }

    @DeleteMapping("/delete-single-row")
    @Override
    public ResponseResult deleteSingleRowById(@RequestBody Orthogroups5genomesPlus row) {
        return deleteSingleRowByIdActual(row);
    }

    @DeleteMapping("/delete-rows")
    @Override
    public ResponseResult deleteRowsByIds(@RequestBody List<Orthogroups5genomesPlus> rows) {
        return deleteRowsByIdsActual(rows);
    }

    @GetMapping("/rows-size")
    @Override
    public ResponseResult getRowsSize() {
        return getRowsSizeActual();
    }

    @GetMapping("/search/{name}")
    @Override
    public ResponseResult getData(@PathVariable String name) {
        return getDataActual(name);
    }

    @PostMapping("/upload")
    @Override
    public ResponseResult upload(@RequestParam("file") MultipartFile multipartFile) {
        return uploadActual(multipartFile);
    }

    @GetMapping("/search-multi-key")
    @Override
    public ResponseResult searchValueByMultiKey(@RequestParam("formValues") List<String> values, @RequestParam("currentPage") Integer currentPage) {
        return searchValueByMultiKeyActual(values, currentPage);
    }

    @PutMapping("/update-single-data")
    @Override
    public ResponseResult updateSingleData(@RequestParam("values") List<String> values, @RequestBody Orthogroups5genomesPlus object) {
        return updateSingleDataActual(values, object);
    }

    @PostMapping("/save-single-data")
    @Override
    public ResponseResult saveSingleData(@RequestBody Orthogroups5genomesPlus object) {
        return saveSingleDataActual(object);
    }

    @DeleteMapping("/delete-single-data")
    @Override
    public ResponseResult deleteSingleDataByColumns(@RequestParam List<String> singleRowValues) {
        return deleteSingleDataByColumnsActual(singleRowValues);
    }

    @DeleteMapping("/delete-multi-data-main")
    @Override
    public ResponseResult deleteBatchOnMainTable(@RequestBody List<Orthogroups5genomesPlus> values) {
        return deleteBatchOnMainTableActual(values);
    }


    @DeleteMapping("/delete-multi-data-sub")
    @Override
    public ResponseResult deleteBatchOnSubTable(@RequestParam List<String> formValues) {
        return deleteBatchOnSubTableActual(formValues);
    }

    @GetMapping("/search-orthogroup")
    public ResponseResult searchOrthogroup(@RequestParam String value,@RequestParam Long current) {

        QueryWrapper<Orthogroups5genomesPlus> wrapper = new QueryWrapper<>();
        wrapper.like("A1_a_HAU", value);
        List<Orthogroups5genomesPlus> orthogroups5genomesPluses = service.list(wrapper);
        ArrayList<String> genes = new ArrayList<>();
        for (Orthogroups5genomesPlus orthogroups5genomesPlus : orthogroups5genomesPluses) {
            genes.addAll(Arrays.asList(orthogroups5genomesPlus.getA1AHau().split(",")));
        }

        List<String> generatedGenes = genes.stream().map(gene -> gene.substring(10, gene.length())).toList();

        QueryWrapper<A1AHau> queryWrapper = new QueryWrapper<>();
        for (String gene : generatedGenes) {
            queryWrapper.like("attributes", gene).or();
        }
        queryWrapper.eq("feature", "gene");
        Page<A1AHau> page = new Page<A1AHau>(current, MyBatisConstants.PAGE_SIZE);
        ArrayList<A1AHau> a1AHaus = new ArrayList<>() {
            {
                addAll(a1AHauService.page(page,queryWrapper).getRecords());
            }
        };

        return ResponseResult.success(a1AHaus);
    }


}

