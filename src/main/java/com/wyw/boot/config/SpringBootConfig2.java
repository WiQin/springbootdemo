package com.wyw.boot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * spring注入方式2
 * 在方法中使用ConfigurationProperties注解
 *
 * @author wangyw
 * @date 2019/11/13
 */
@Configuration
public class SpringBootConfig2 {

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource getDataSource3(){
        return new DruidDataSource();
    }
}
