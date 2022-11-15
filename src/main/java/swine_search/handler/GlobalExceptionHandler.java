package swine_search.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import swine_search.exception.TargetDateNotFoundException;
import swine_search.util.ResponseResult;
import swine_search.util.ResponseResultCode;

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
