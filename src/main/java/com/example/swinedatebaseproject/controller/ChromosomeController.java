package com.example.swinedatebaseproject.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.swinedatebaseproject.constant.MyBatisConstants;
import com.example.swinedatebaseproject.domain.Chromosome;
import com.example.swinedatebaseproject.service.ChromosomeService;
import com.example.swinedatebaseproject.util.ResponseResultUtils;
import com.example.swinedatebaseproject.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 刘铭康
 * @Date 2022/11/14
 */
@RestController
@RequestMapping("/chromosome")
public class ChromosomeController {
    @Autowired
    ChromosomeService chromosomeService;

    @GetMapping("/id/{id}")
    public ResponseResult getCdsById(@PathVariable Integer id) {
        Chromosome chromosome = chromosomeService.getById(id);
        return ResponseResultUtils.getResponseResult(Chromosome.class, chromosome);
    }

    @GetMapping("/all")
    public ResponseResult getAllCds() {
        List<Chromosome> list = chromosomeService.list();
        return ResponseResultUtils.getResponseResult(Chromosome.class, list);

    }

    @GetMapping("/page/{current}")
    public ResponseResult getCdsBasePage(@PathVariable Integer current) {
        Page<Chromosome> chromosomePage = new Page<>(current, MyBatisConstants.PAGE_SIZE);
        List<Chromosome> records = chromosomeService.page(chromosomePage).getRecords();
        return ResponseResultUtils.getResponseResult(Chromosome.class, records);
    }

    @GetMapping("/page-count")
    public ResponseResult getPageCount() {
        Long totalRows = chromosomeService.count();
        Long pageCount = totalRows % MyBatisConstants.PAGE_SIZE == 0 ? totalRows / MyBatisConstants.PAGE_SIZE : totalRows / MyBatisConstants.PAGE_SIZE + 1;
        // TODO: 2022/11/16 基于路径？？？ 动态获取keyName
        return ResponseResultUtils.getSuccessResponseResult("pageCount", pageCount);
    }
}


