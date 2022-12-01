package com.example.swinedatebaseproject.constant;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 刘铭康
 * @Date  2022/11/14
 */
public class CommonConstants {
    public static final String SUFFIX = "List";
    public static final List<Class<?>> PACKING_TYPES = new ArrayList<>() {
        {
            add(String.class);
            add(Long.class);
            add(Integer.class);
        }
    };
}
