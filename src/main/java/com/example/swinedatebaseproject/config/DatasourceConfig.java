package com.example.swinedatebaseproject.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * @Author 刘铭康
 * @Date 2022/11/14
 */
public class DatasourceConfig {

    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.private")
    @Bean
    @Primary
    public DruidDataSource primaryDruidDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.public")
    @Bean
    public DruidDataSource slaveDruidDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

}
