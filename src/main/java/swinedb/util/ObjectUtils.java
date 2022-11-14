package swinedb.util;

import swinedb.exception.TargetDateNotFoundException;

import java.util.Objects;

/**
 * @author 刘铭康
 * @version 2022/11/14
 */
public class ObjectUtils {
    public static void nonNullAndThrowTargetDateNotFoundException(Object data) {
        if (Objects.isNull(data)) {
            throw new TargetDateNotFoundException();
        }
    }
}
