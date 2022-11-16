package swine_search.util;

import org.jetbrains.annotations.NotNull;
import swine_search.constant.CommonConstants;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 刘铭康
 * @Date  2022/11/14
 * @Description 向ResponseResult中增加单条数据（单对象/单集合）
 */
public class ResponseDataUtils {

    @NotNull
    private static String getCommonKeyName(String simpleName) {
        String oldFirstChar = String.valueOf(simpleName.charAt(0));
        String lowerCaseClassName = simpleName.toLowerCase();
        String newFirstChar = String.valueOf(lowerCaseClassName.charAt(0));
        return simpleName.replaceFirst(oldFirstChar, newFirstChar);
    }

    @NotNull
    private static <T> String getKeyNameBaseSingleData(Class<T> dataClass) {
        return getCommonKeyName(dataClass.getSimpleName());
    }


    @NotNull
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

    public static <T> ResponseResult getResponseResult(Class<T> dataClass, Object data) {
        Map<String, Object> dataMap = getDataMap(dataClass, data);
        return ResponseResult.success(dataMap);
    }

    public static ResponseResult getResponseResult(String keyName, Object data) {
        Map<String, Object> dataMap = new HashMap<>() {
            {
                put(keyName, data);
            }
        };
        return ResponseResult.success(dataMap);
    }





}
