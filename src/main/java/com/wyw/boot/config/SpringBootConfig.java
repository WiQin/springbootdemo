package com.wyw.boot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * springboot配置方式1
 * 使用EnableConfigurationProperties引入SpringBootProperties文件
 *
 *
 * @author wangyw
 * @date 2019/11/13
 */
@Configuration
@EnableConfigurationProperties(SpringBootProperties.class)
public class SpringBootConfig {

    @Bean
    public DataSource getDataSource2(SpringBootProperties prop){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(prop.getDriverClassName());
        dataSource.setUrl(prop.getUrl());
        dataSource.setUsername(prop.getUserName());
        dataSource.setPassword(prop.getPassWord());
        return dataSource;
    }
}
