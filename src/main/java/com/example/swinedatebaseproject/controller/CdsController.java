package com.example.swinedatebaseproject.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.swinedatebaseproject.constant.MyBatisConstants;
import com.example.swinedatebaseproject.domain.Cds;
import com.example.swinedatebaseproject.service.CdsService;
import com.example.swinedatebaseproject.util.ResponseDataUtils;
import com.example.swinedatebaseproject.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 刘铭康
 * @Date  2022/11/14
 */
@RestController
@RequestMapping("/cds")
public class CdsController {
    @Autowired
    CdsService cdsService;

    @GetMapping("/id/{id}")
    public ResponseResult getCdsById(@PathVariable Integer id) {
        Cds cds = cdsService.getById(id);
        return ResponseDataUtils.getResponseResult(Cds.class, cds);
    }

    @GetMapping("/all")
    public ResponseResult getAllCds() {
        List<Cds> list = cdsService.list();
        return ResponseDataUtils.getResponseResult(Cds.class, list);

    }

    @GetMapping("/page/{current}")
    public ResponseResult getCdsBasePage(@PathVariable Integer current) {
        Page<Cds> cdsPage = new Page<>(current, MyBatisConstants.PAGE_SIZE);
        List<Cds> records = cdsService.page(cdsPage).getRecords();
        return ResponseDataUtils.getResponseResult(Cds.class, records);
    }

    @GetMapping("/page-count")
    public ResponseResult getPageCount() {
        Long totalRows = cdsService.count();
        Long pageCount = totalRows % MyBatisConstants.PAGE_SIZE == 0 ? totalRows / MyBatisConstants.PAGE_SIZE : totalRows / MyBatisConstants.PAGE_SIZE + 1;
        // TODO: 2022/11/16 基于路径？？？ 动态获取keyName
        return ResponseDataUtils.getResponseResult("pageCount", pageCount);
    }

}
