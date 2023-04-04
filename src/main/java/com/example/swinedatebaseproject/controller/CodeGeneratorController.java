package com.example.swinedatebaseproject.controller;

import com.example.swinedatebaseproject.response.ResponseResult;
import com.example.swinedatebaseproject.response.ResponseResultCode;
import com.example.swinedatebaseproject.service.CodeGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @作者 DD
 * @创建时间 2023/3/16
 */

@RestController
@RequestMapping("generate")
public class CodeGeneratorController {

    @Autowired
    CodeGeneratorService codeGeneratorService;

    /**
     * @param domain 实体表名
     */
    @PutMapping("/domain/{domain}")
    public ResponseResult generateDomain(@PathVariable String domain, @RequestParam Map<String, String> params) {
        if (codeGeneratorService.generateDomain(domain,params)) {
            return ResponseResult.success(ResponseResultCode.ADD_SUCCESS.getCode(), ResponseResultCode.ADD_SUCCESS.getMessage());
        } else {
            return ResponseResult.success(ResponseResultCode.ADD_FAIL.getCode(), ResponseResultCode.ADD_FAIL.getMessage());
        }
    }

}
