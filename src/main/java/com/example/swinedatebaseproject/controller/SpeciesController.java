package com.example.swinedatebaseproject.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.swinedatebaseproject.constant.MyBatisConstants;
import com.example.swinedatebaseproject.domain.Species;
import com.example.swinedatebaseproject.service.SpeciesService;
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
@RequestMapping("/species")
public class SpeciesController {
    @Autowired
    SpeciesService speciesService;

    @GetMapping("/id/{id}")
    public ResponseResult getSpeciesById(@PathVariable Integer id) {
        Species species = speciesService.getById(id);
        return ResponseResultUtils.getResponseResult(Species.class, species);
    }

    @GetMapping("/all")
    public ResponseResult getAllSpecies() {
        List<Species> list = speciesService.list();
        return ResponseResultUtils.getResponseResult(Species.class, list);

    }

    @GetMapping("/page/{current}")
    public ResponseResult getSpeciesBasePage(@PathVariable Integer current) {
        Page<Species> speciesPage = new Page<>(current, MyBatisConstants.PAGE_SIZE);
        List<Species> records = speciesService.page(speciesPage).getRecords();
        return ResponseResultUtils.getResponseResult(Species.class, records);
    }

    @GetMapping("/page-count")
    public ResponseResult getPageCount() {
        Long totalRows = speciesService.count();
        Long pageCount = totalRows % MyBatisConstants.PAGE_SIZE == 0 ? totalRows / MyBatisConstants.PAGE_SIZE : totalRows / MyBatisConstants.PAGE_SIZE + 1;
        // TODO: 2022/11/16 基于路径？？？ 动态获取keyName
        return ResponseResultUtils.getSuccessResponseResult("pageCount", pageCount);
    }
}
