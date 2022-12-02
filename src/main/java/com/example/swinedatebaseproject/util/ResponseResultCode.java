package com.example.swinedatebaseproject.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author 刘铭康
 * @Date  2022/11/14
 */
@Getter
@AllArgsConstructor
@SuppressWarnings("all")

public enum ResponseResultCode {
    SUCCESS("A0001", "请求成功"),

    DATE_NOT_FOUND("A0002", "目标数据未找到"),

    LOGIN_SUCCESS("B0001", "登录成功"),
    LOGIN_FAIL("B0002", "登录失败"),
    REGISTER_SUCCESS("B0003", "注册成功"),
    REGISTER_FAIL("B0004", "注册失败"),
    NOT_REGISTER("B0005", "未注册"),
    NOT_LOGIN("B0006", "未登录"),
    AUTHEMTICATION_FAIL("A0007", "认证失败，请重新登录");

    private final String code;
    private final String message;
}

