package com.example.swinedatebaseproject.util;

import com.example.swinedatebaseproject.constant.CommonConstants;
import com.example.swinedatebaseproject.response.ResponseResult;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 刘铭康
 * @Date  2022/11/14
 * @Description 向ResponseResult中增加单条数据（单对象/单集合）
 */

public class ResponseResultUtils {

    private static String getCommonKeyName(String simpleName) {
        String oldFirstChar = String.valueOf(simpleName.charAt(0));
        String lowerCaseClassName = simpleName.toLowerCase();
        String newFirstChar = String.valueOf(lowerCaseClassName.charAt(0));
        return simpleName.replaceFirst(oldFirstChar, newFirstChar);
    }

    private static <T> String getKeyNameBaseSingleData(Class<T> dataClass) {
        return getCommonKeyName(dataClass.getSimpleName());
    }


    private static <T> String getKeyNameBaseCollectionData(Class<T> dataClass) {
        return getCommonKeyName(dataClass.getSimpleName()) + CommonConstants.SUFFIX;
    }

    private static <T> Map<String, Object> getDataMap(Class<T> dataClass, Object data) {
        ObjectUtils.nonNullAndThrowTargetDateNotFoundException(data);
        String keyName = data instanceof Collection ? getKeyNameBaseCollectionData(dataClass) : getKeyNameBaseSingleData(dataClass);
        return new HashMap<>() {
            {
                put(keyName, data);
            }
        };
    }

    /**
     * 需基于传入数据动态配置keyName
     * 单个Cds对象 keyName->cds
     * Cds对象集合 keyName->cdsList
     */
    public static <T> ResponseResult getResponseResult(Class<T> dataClass, Object data) {
        Map<String, Object> dataMap = getDataMap(dataClass, data);
        return ResponseResult.success(dataMap);
    }

    /**
     * 自指定keyName
     */
    public static ResponseResult getSuccessResponseResult(String keyName, Object data) {
        Map<String, Object> dataMap = new HashMap<>() {
            {
                put(keyName, data);
            }
        };
        return ResponseResult.success(dataMap);
    }

    /**
     * 自指定keyName
     */
    public static ResponseResult getResponseResult(String message,String code,String keyName, Object data) {
        Map<String, Object> dataMap = new HashMap<>() {
            {
                put(keyName, data);
            }
        };
        return ResponseResult.success(message,code,dataMap);
    }

}
