package com.wyw.boot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 使用springboot配置方式
 * 需要把配置文件改为固定文件名  application.properties
 * 使用ConfigurationProperties配置
 * 变量名需与配置文件中名称相同
 *
 * @author wangyw
 * @date 2019/11/13
 */
@ConfigurationProperties(prefix = "jdbc")
@Data
public class SpringBootProperties {
    String driverClassName;
    String url;
    String userName;
    String passWord;
}


