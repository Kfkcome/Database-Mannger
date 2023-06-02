package com.example.swinedatebaseproject.response;

import lombok.AllArgsConstructor;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.reflect.Field;

/**
 * @作者 DD
 * @创建时间 2023/6/2
 */
@ControllerAdvice
public class GlobalErrorResponseHandler implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return returnType.getParameterType().equals(ResponseResultCode.class);
    }

    @Override
    public ResponseResult beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        try {
            Field codeField = ResponseResultCode.class.getDeclaredField("code");
            codeField.setAccessible(true);
            String code = (String) codeField.get(body);

            Field messageField = ResponseResultCode.class.getDeclaredField("message");
            messageField.setAccessible(true);
            String message = (String) messageField.get(body);

            return ResponseResult.error(code, message);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            return ResponseResult.error(ResponseResultCode.ERROR);
        }
    }
}
