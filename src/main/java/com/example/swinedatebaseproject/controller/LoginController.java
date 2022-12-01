package com.example.swinedatebaseproject.controller;

import com.example.swinedatebaseproject.domain.Administrator;
import com.example.swinedatebaseproject.domain.CommonUser;
import com.example.swinedatebaseproject.service.LoginService;
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
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/user")
    public ResponseResult userLogin(CommonUser commonUser) {
        if (loginService.userLogin(commonUser)) {
            return ResponseResult.success(ResponseResultCode.LOGIN_SUCCESS.getCode(), ResponseResultCode.LOGIN_SUCCESS.getMessage());
        }else {
            return ResponseResult.error(ResponseResultCode.LOGIN_FAIL.getCode(), ResponseResultCode.LOGIN_FAIL.getMessage());
        }
    }

    @PostMapping("/administrator")
    public ResponseResult administratorLogin(Administrator administrator) {
        if (loginService.administratorLogin(administrator)) {
            return ResponseResult.success(ResponseResultCode.LOGIN_SUCCESS.getCode(), ResponseResultCode.LOGIN_SUCCESS.getMessage());
        }else {
            return ResponseResult.error(ResponseResultCode.LOGIN_FAIL.getCode(), ResponseResultCode.LOGIN_FAIL.getMessage());
        }
    }
}
