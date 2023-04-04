package com.example.swinedatebaseproject.config;

import com.example.swinedatebaseproject.interceptor.SearchMultiKeyHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author 刘铭康
 * @Date 2022/11/14
 */
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SearchMultiKeyHandlerInterceptor()).addPathPatterns("/**");

//        registry.addInterceptor(new SearchMultiKeyHandlerInterceptor()).addPathPatterns("/*/search-multi-key");
    }


}