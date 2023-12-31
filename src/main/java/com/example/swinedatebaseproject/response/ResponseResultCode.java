package com.example.swinedatebaseproject.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author 刘铭康
 * @Date 2022/11/14
 */
@Getter
@AllArgsConstructor
@SuppressWarnings("all")
public enum ResponseResultCode {

    SUCCESS("A0001", "请求成功"),
    DATA_NOT_FOUND("A0002", "目标数据未找到"),
    DELETE_SUCCESS("A0003", "数据删除成功"),
    DELETE_FAIL("A0004", "数据删除失败"),
    ADD_SUCCESS("A0005", "数据添加成功"),
    ADD_FAIL("A0006", "数据添加失败"),
    FILE_TYPE_ERROR("A0007", "文件类型错误"),
    DATA_TYPE_ERROR("A0008", "数据类型错误"),
    UPDATE_DATA_FAIL("A0009", "数据更新失败"),

    LOGIN_SUCCESS("B0001", "登录成功"),
    LOGIN_FAIL("B0002", "登录失败"),
    REGISTER_SUCCESS("B0003", "注册成功"),
    REGISTER_FAIL("B0004", "注册失败"),
    NOT_REGISTER("B0005", "未注册"),
    NOT_LOGIN("B0006", "未登录"),
    AUTHEMTICATION_FAIL("B0007", "认证失败，请重新登录"),
    ERROR("B0008", "请求失败，请重新请求"),
    ERROR_CONDITION("B0009", "输入参数格式错误"),
    ERRPR_PAGE("B0010", "页码溢出"),
    REQUEST_TIMEOUT("B0011", "请求超时"),
    NOT_GENE("B0012", "输入值错误，正确输入值应为feature=gene数据的attribute值"),
    TABLE_ERROR("B0013", "输入值错误，正确输入值范围仅限于a1hau、a2hau、ad1hau三张表数据"),
    SERVER_ERROR("B0014", "服务端错误，请重新请求"),
    SNP_ZERO("B0015", "无对应snp数据");

    private final String code;
    private final String message;
}

