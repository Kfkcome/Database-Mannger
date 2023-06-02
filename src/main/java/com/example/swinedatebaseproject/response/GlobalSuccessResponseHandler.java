package com.example.swinedatebaseproject.response;

import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @作者 DD
 * @创建时间 2023/6/2
 */

@ControllerAdvice
public class GlobalSuccessResponseHandler implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        Class<?> parameterType = returnType.getParameterType();
        Class<?> declaringClass = returnType.getDeclaringClass();
        Method method = returnType.getMethod();
        return !(Objects.isNull(method) || parameterType.equals(ResponseResult.class) || parameterType.equals(ResponseResultCode.class) ||
                AnnotatedElementUtils.hasAnnotation(declaringClass, NoResponseResult.class) || AnnotatedElementUtils.hasAnnotation(method, NoResponseResult.class));
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        return ResponseResult.success(body);
    }

}
