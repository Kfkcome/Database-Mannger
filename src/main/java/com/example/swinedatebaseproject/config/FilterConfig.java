package com.example.swinedatebaseproject.config;

import com.example.swinedatebaseproject.filter.JwtFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @Author 刘铭康
 * @Date 2022/11/14
 */
@Configuration
public class FilterConfig {
    @Autowired
    JwtFilter jwtFilter;

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(jwtFilter);
        return registrationBean;
    }
}
