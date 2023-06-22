package com.example.swinedatebaseproject.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @作者 DD
 * @创建时间 2023/6/22
 */
@Data
@AllArgsConstructor
public class PageResult {
    private int size;
    private int current;
    private Object data;
}
