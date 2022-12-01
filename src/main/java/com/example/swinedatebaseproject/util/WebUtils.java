package com.example.swinedatebaseproject.util;

import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author 刘铭康
 * @Date 2022/11/14
 */
public class WebUtils {

    // 配置HttpResponse信息
    public static void renderString(HttpServletResponse response, String value) {
        try {
            response.setStatus(200);
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            response.getWriter().print(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void renderString(HttpServletResponse response, HttpStatus httpStatus, String string) {
        try {
            response.setStatus(httpStatus.value());
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            response.getWriter().print(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void renderString(HttpServletResponse response, HttpStatus httpStatus,String contentType, String string) {
        try {
            response.setStatus(httpStatus.value());
            response.setContentType(contentType);
            response.setCharacterEncoding("utf-8");
            response.getWriter().print(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}