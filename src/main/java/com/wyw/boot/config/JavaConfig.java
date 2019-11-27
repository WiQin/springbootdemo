package com.wyw.boot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * java方式配置bean
 * 使用Configuration，Configuration,Bean,Value注解实现bean配置
 *
 * @author wangyw
 * @date 2019/11/13
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class JavaConfig {

    @Value("${jdbc.driverClassName}")
    String driver;
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.userName}")
    String userName;
    @Value("${jdbc.passWord}")
    String passWord;

    @Bean
    public DataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(passWord);
        return dataSource;
    }
}
