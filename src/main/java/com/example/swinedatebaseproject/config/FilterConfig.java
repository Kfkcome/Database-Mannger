package com.example.swinedatebaseproject.config;

import com.example.swinedatebaseproject.filter.DynamicDatasourceFilter;
import com.example.swinedatebaseproject.filter.JwtFilter;
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
    @Bean
    public FilterRegistrationBean jwtFilter() {
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new JwtFilter());
        registrationBean.setOrder(Integer.MAX_VALUE);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean dynamicDatasourceFilter() {
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new DynamicDatasourceFilter());
        registrationBean.setOrder(-1);
        return registrationBean;
    }

}
