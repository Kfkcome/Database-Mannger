package swine_search.util;

import swine_search.exception.TargetDateNotFoundException;

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
}
