package com.example.swinedatebaseproject.util;

import com.example.swinedatebaseproject.exception.TargetDateNotFoundException;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @Author 刘铭康
 * @Date  2022/11/14
 */
public class ObjectUtils {
    public static void nonNullAndThrowTargetDateNotFoundException(Object data) {
        if (Objects.isNull(data)) {
            throw new TargetDateNotFoundException();
        }
    }

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void printMapValues(Map<?, ?> map) {
        map.forEach((o, o2) -> {
            System.out.println(o2);
        });
    }

    public static void printMapKeys(Map<?, ?> map) {
        map.forEach((o, o2) -> {
            System.out.println(o);
        });
    }



}
