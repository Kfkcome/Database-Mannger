package swine_search.util;

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

    DATE_NOT_FOUND("A0002", "目标数据未找到");

    private final String code;
    private final String message;

}

