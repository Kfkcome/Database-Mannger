package swine_search.util;

import org.jetbrains.annotations.NotNull;
import swine_search.constant.CommonConstants;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 刘铭康
 * @Date  2022/11/14
 */
public class ResponseDataUtils {

    @NotNull
    private static <T> String getCommonKeyName(String simpleName, Class<T> tClass) {
        String oldFirstChar = String.valueOf(simpleName.charAt(0));
        String lowerCaseClassName = simpleName.toLowerCase();
        String newFirstChar = String.valueOf(lowerCaseClassName.charAt(0));
        String value = simpleName.replaceFirst(oldFirstChar, newFirstChar);
        return value + CommonConstants.SUFFIX;
    }

    @NotNull
    private static <T> String getKeyNameBaseCollectionSingleData(Class<T> tClass) {
        return getCommonKeyName(tClass.getSimpleName(), tClass);
    }


    @NotNull
    private static <T> String getKeyNameBaseCollectionData(Class<T> tClass) {
        return getCommonKeyName(tClass.getSimpleName(), tClass);
    }

    private static <T> Map<String, Object> getDataMap(Class<T> tClass, Object data) {
        ObjectUtils.nonNullAndThrowTargetDateNotFoundException(data);
        String keyName = data instanceof Collection ? getKeyNameBaseCollectionData(tClass) : getKeyNameBaseCollectionSingleData(tClass);
        return new HashMap<String, Object>() {
            {
                put(keyName, data);
            }
        };
    }

    public static <T> ResponseResult getResponseResult(Class<T> tClass, Object data) {
        Map<String, Object> dataMap = getDataMap(tClass, data);
        return ResponseResult.success(dataMap);
    }


}
