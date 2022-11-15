package swinedb.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import swinedb.exception.TargetDateNotFoundException;
import swinedb.util.ResponseResult;
import swinedb.util.ResponseResultCode;

/**
 * @Author 刘铭康
 * @Date  2022/11/14
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({TargetDateNotFoundException.class})
    public ResponseResult handleException(TargetDateNotFoundException e) {
        return ResponseResult.error(ResponseResultCode.DATE_NOT_FOUND.getCode(), ResponseResultCode.DATE_NOT_FOUND.getMessage());
    }

}
