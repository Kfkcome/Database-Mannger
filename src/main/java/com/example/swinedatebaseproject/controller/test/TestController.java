package com.example.swinedatebaseproject.controller.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 DD
 * @创建时间 2023/6/3
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/v1")
    public Object test() {
        return "1";
    }
}
