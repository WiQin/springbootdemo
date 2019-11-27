package com.wyw.boot.config;

import lombok.Data;

/**
 * springboot配置方式2
 * 将ConfigurationProperties注解用到config中
 * 使用application.yaml配置文件
 * （与properties文件作用相同，格式不同，且支持对象及集合的配置）
 *
 * @author wangyw
 * @date 2019/11/13
 */
@Data
public class SpringBootProperties2 {
    String driverClassName;
    String url;
    String userName;
    String passWord;
}
