package com.example.swinedatebaseproject.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 刘铭康
 * @Date 2022/11/14
 */
@Configuration
public class MyBatisPlusConfig {
    @Bean
    public MybatisPlusInterceptor paginationInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        PaginationInnerInterceptor pageInterceptor = new PaginationInnerInterceptor();
        pageInterceptor.setOverflow(true);
        pageInterceptor.setMaxLimit(500L);
        pageInterceptor.setDbType(DbType.MYSQL);
        interceptor.addInnerInterceptor(pageInterceptor);
        return interceptor;
    }

    @Bean
    public DataSourceAutoConfiguration dataSourceAutoConfiguration() {
        return new DataSourceAutoConfiguration();
    }
}