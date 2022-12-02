package com.example.swinedatebaseproject.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.swinedatebaseproject.constant.MyBatisConstants;
import com.example.swinedatebaseproject.domain.Genome;
import com.example.swinedatebaseproject.service.GenomeService;
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
 * @Date  2022/11/14
 */
@RestController
@RequestMapping("/genome")
public class GenomeController {
    @Autowired
    GenomeService genomeService;
    

    @GetMapping("/id/{id}")
    public ResponseResult getCdsById(@PathVariable Integer id) {
        Genome genome = genomeService.getById(id);
        return ResponseResultUtils.getResponseResult(Genome.class, genome);
    }

    @GetMapping("/all")
    public ResponseResult getAllCds() {
        List<Genome> list = genomeService.list();
        return ResponseResultUtils.getResponseResult(Genome.class, list);

    }

    @GetMapping("/page/{current}")
    public ResponseResult getCdsBasePage(@PathVariable Integer current) {
        Page<Genome> cdsPage = new Page<>(current, MyBatisConstants.PAGE_SIZE);
        List<Genome> records = genomeService.page(cdsPage).getRecords();
        return ResponseResultUtils.getResponseResult(Genome.class, records);
    }

    @GetMapping("/page-count")
    public ResponseResult getPageCount() {
        Long totalRows =  genomeService.count();
        Long pageCount = totalRows % MyBatisConstants.PAGE_SIZE == 0 ? totalRows / MyBatisConstants.PAGE_SIZE : totalRows / MyBatisConstants.PAGE_SIZE + 1;
        // TODO: 2022/11/16 基于路径？？？ 动态获取keyName
        return ResponseResultUtils.getSuccessResponseResult("pageCount", pageCount);
    }
}
