package com.example.swinedatebaseproject.controller;

import com.example.swinedatebaseproject.domain.Administrator;
import com.example.swinedatebaseproject.domain.CommonUser;
import com.example.swinedatebaseproject.service.RegisterService;
import com.example.swinedatebaseproject.util.ResponseResult;
import com.example.swinedatebaseproject.util.ResponseResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 刘铭康
 * @Date 2022/11/14
 */
@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @PostMapping("/user")
    public ResponseResult userLogin(CommonUser commonUser) {
        if (registerService.userRegister(commonUser)) {
            return ResponseResult.success(ResponseResultCode.REGISTER_SUCCESS.getCode(), ResponseResultCode.REGISTER_SUCCESS.getMessage());
        }else {
            return ResponseResult.error(ResponseResultCode.REGISTER_FAIL.getCode(), ResponseResultCode.REGISTER_FAIL.getMessage());
        }
    }

    @PostMapping("/administrator")
    public ResponseResult administratorLogin(Administrator administrator) {
        if (registerService.administratorRegister(administrator)) {
            return ResponseResult.success(ResponseResultCode.REGISTER_SUCCESS.getCode(), ResponseResultCode.REGISTER_SUCCESS.getMessage());
        }else {
            return ResponseResult.error(ResponseResultCode.REGISTER_FAIL.getCode(), ResponseResultCode.REGISTER_FAIL.getMessage());
        }
    }
}
