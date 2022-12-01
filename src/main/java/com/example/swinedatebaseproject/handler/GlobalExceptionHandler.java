package com.example.swinedatebaseproject.handler;

import com.example.swinedatebaseproject.exception.TargetDateNotFoundException;
import com.example.swinedatebaseproject.util.ResponseResult;
import com.example.swinedatebaseproject.util.ResponseResultCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

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
