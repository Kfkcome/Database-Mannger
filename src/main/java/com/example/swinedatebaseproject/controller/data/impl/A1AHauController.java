package com.example.swinedatebaseproject.controller.data.impl;

import com.example.swinedatebaseproject.controller.data.CommonController;
import com.example.swinedatebaseproject.response.ResponseResult;
import com.example.swinedatebaseproject.domain.A1AHau;
import com.example.swinedatebaseproject.service.A1AHauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @作者 DD
 * @创建时间 2023/3/6
 */

@RestController
@RequestMapping(value = "a1AHau",method = {RequestMethod.DELETE,RequestMethod.GET,RequestMethod.POST})
public class A1AHauController extends CommonController<A1AHau> {


    @Autowired
    public A1AHauController(A1AHauService service) {
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

    @DeleteMapping("/delete")
    @Override
    public ResponseResult deleteByIds(@RequestParam("ids") List<String> ids) {
        return deleteByIdsActual(ids);
    }

    @GetMapping ("/rows-size")
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
    public ResponseResult updateSingleData(@RequestParam("values")List<String> values, @RequestBody A1AHau object) {
        return updateSingleDataActual(values, object);
    }

    @PostMapping("/save-single-data")
    @Override
    public ResponseResult saveSingleData(@RequestBody A1AHau object) {
        return saveSingleDataActual(object);
    }

    @DeleteMapping("/delete-single-data")
    @Override
    public ResponseResult deleteSingleDataByColumns(@RequestParam List<String> singleRowValues) {
        return deleteSingleDataByColumnsActual(singleRowValues);
    }

    @DeleteMapping("/delete-multi-data-main")
    @Override
    public ResponseResult deleteBatchOnMainTable(@RequestBody List<A1AHau> values) {
        return deleteBatchOnMainTableActual(values);
    }


    @DeleteMapping("/delete-multi-data-sub")
    @Override
    public ResponseResult deleteBatchOnSubTable(@RequestParam List<String> formValues) {
        return deleteBatchOnSubTableActual(formValues);
    }

}

