#springboot基础配置
继承springboot

    <parent>  
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <version>2.2.0.RELEASE</version>
    </parent>
    
    
springboot项目启动不需要任何配置，但是在实际项目中用到的bean配置如何来实现

--java配置  
java配置主要靠java类和一些注解  
@Configuration  声明一个类作为配置类，代替xml文件  
@Bean  声明在方法上,将方法返回值加入bean容器，代替bean标签  
@PropertySource  读取外部属性文件  
@Value 属性注入

程序：
jdbc.properties
JdbcConfig  

--SpringBoot属性注入方式1
使用application.properties

程序：
appliciton.properties  
JdbcProperties   ConfigurationProperties注解  
JdbcConfig2  Configuration注解+EnableConfigurationProperties(使用JdbcProperties)  


--SpringBoot属性注入方式2

程序  
application.properties  
JdbcProperties2  
JdbcConfig3  

--yaml配置  
支持对象和集合

如果application.properties 和 application.yaml都有，取并集  
如果属性冲突，以properties为准

--自动配置原理
生效条件
    引入相关依赖  
    自己没有配置bean（配置后会走自定义bean）

spring-boot-autoconfigurejar包  
spring.factories 
org.springframework.boot.autoconfigure.EnableAutoConfiguration


自定义启动器：META-INF包下新增spring.properties,
org.springframework.boot.autoconfigure.EnableAutoConfiguration=\

新增AutoConfiguration