package com.example.swinedatebaseproject.controller;

import com.example.swinedatebaseproject.domain.Administrator;
import com.example.swinedatebaseproject.domain.CommonUser;
import com.example.swinedatebaseproject.service.LoginService;
import com.example.swinedatebaseproject.util.JwtUtils;
import com.example.swinedatebaseproject.util.ResponseResult;
import com.example.swinedatebaseproject.util.ResponseResultCode;
import com.example.swinedatebaseproject.util.ResponseResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


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
            String jwt = JwtUtils.createJwt("Login", Map.of("userName", commonUser.getName()));
            return ResponseResultUtils.getResponseResult(ResponseResultCode.LOGIN_SUCCESS.getCode(), ResponseResultCode.LOGIN_SUCCESS.getMessage(), "token", jwt);
        }else {
            return ResponseResult.error(ResponseResultCode.LOGIN_FAIL.getCode(), ResponseResultCode.LOGIN_FAIL.getMessage());
        }
    }

    @PostMapping("/administrator")
    public ResponseResult administratorLogin(Administrator administrator) {
        if (loginService.administratorLogin(administrator)) {
            String jwt = JwtUtils.createJwt("Login", Map.of("userName", administrator.getName()));
            return ResponseResultUtils.getResponseResult(ResponseResultCode.LOGIN_SUCCESS.getCode(), ResponseResultCode.LOGIN_SUCCESS.getMessage(), "token", jwt);
        }else {
            return ResponseResult.error(ResponseResultCode.LOGIN_FAIL.getCode(), ResponseResultCode.LOGIN_FAIL.getMessage());
        }
    }
}
