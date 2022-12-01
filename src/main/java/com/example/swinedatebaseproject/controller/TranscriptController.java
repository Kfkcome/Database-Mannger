package com.example.swinedatebaseproject.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.swinedatebaseproject.constant.MyBatisConstants;
import com.example.swinedatebaseproject.domain.Transcript;
import com.example.swinedatebaseproject.service.TranscriptService;
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
 * @Date 2022/11/14
 */
@RestController
@RequestMapping("/transcript")
public class TranscriptController {
    @Autowired
    TranscriptService transcriptService;

    @GetMapping("/id/{id}")
    public ResponseResult getTranscriptById(@PathVariable Integer id) {
        Transcript transcript = transcriptService.getById(id);
        return ResponseDataUtils.getResponseResult(Transcript.class, transcript);
    }

    @GetMapping("/all")
    public ResponseResult getAllTranscript() {
        List<Transcript> list = transcriptService.list();
        return ResponseDataUtils.getResponseResult(Transcript.class, list);

    }

    @GetMapping("/page/{current}")
    public ResponseResult getTranscriptBasePage(@PathVariable Integer current) {
        Page<Transcript> transcriptPage = new Page<>(current, MyBatisConstants.PAGE_SIZE);
        List<Transcript> records = transcriptService.page(transcriptPage).getRecords();
        return ResponseDataUtils.getResponseResult(Transcript.class, records);
    }

    @GetMapping("/page-count")
    public ResponseResult getPageCount() {
        Long totalRows = transcriptService.count();
        Long pageCount = totalRows % MyBatisConstants.PAGE_SIZE == 0 ? totalRows / MyBatisConstants.PAGE_SIZE : totalRows / MyBatisConstants.PAGE_SIZE + 1;
        // TODO: 2022/11/16 基于路径？？？ 动态获取keyName
        return ResponseDataUtils.getResponseResult("pageCount", pageCount);
    }
}
