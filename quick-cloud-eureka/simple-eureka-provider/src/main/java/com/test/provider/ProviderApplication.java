package com.test.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IDEA
 * User: vector
 * Data: 2017/9/28
 * Time: 14:12
 * Description:
 */
@EnableEurekaClient     // Eureka Client 标识
@SpringBootApplication  // Spring Boot 应用标识
public class ProviderApplication {
    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(ProviderApplication.class,args);
    }
}
