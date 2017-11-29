package com.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * User: vector
 * Data: 2017/9/28
 * Time: 14:12
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Application {

    @RequestMapping("/health")
    public String health() {
        return "hello health ";
    }

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class,args);
    }
}
