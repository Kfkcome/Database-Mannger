package com.example.swinedatebaseproject.controller.data;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.swinedatebaseproject.domain.Literature;
import com.example.swinedatebaseproject.response.ResponseResult;
import com.example.swinedatebaseproject.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @作者 DD
 * @创建时间 2023/8/13
 */
@RequestMapping("literature")
@RestController
public class LiteratureController {

    @Autowired
    LiteratureService literatureService;

    @GetMapping("/get")
    public Object get(@RequestParam String correlationCottonName) {
        return literatureService.list(Wrappers.<Literature>lambdaQuery().eq(Literature::getCorrelationCottonName, correlationCottonName));
    }

    @PostMapping("/put")
    public Object put(@RequestBody Literature literature) {
        literatureService.saveOrUpdate(literature);
        return ResponseResult.success();
    }
}
