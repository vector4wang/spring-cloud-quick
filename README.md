# spring-cloud-quick
学习springcloud,之后会将学习到的放在这里，做快速开发使用

# 项目结构
```bash
.
├── pom.xml
├── quick-cloud-consul
│   ├── pom.xml
│   └── simple-consul-provider
├── quick-cloud-eureka
│   ├── pom.xml
│   ├── simple-eureka-customer
│   ├── simple-eureka-customer-feign
│   ├── simple-eureka-feign-hystrix
│   ├── simple-eureka-hystrix
│   ├── simple-eureka-provider
│   ├── simple-eureka-server
│   └── simple-eureka-zuul
└── README.md
```

# 模块介绍

## quick-cloud-consul 
使用consul作为服务注册中心
注意:Consul客户端需要单独下载

## quick-cloud-eureka
统一使用版本`Dalston.RELEASE` 统一使用Eureka作为注册中心

### simple-eureka-customer
Eureka的客户端，服务的使用者
使用Ribbon作为Http请求的中间件

### simple-eureka-customer-feign
使用Feign作为Http请求的中间件

### simple-eureka-feign-hystrix
在Feign下配置熔断器(Hystrix，类似一个方法要设置返回的默认值)

### simple-eureka-hystrix
在Ribbon下配置熔断器

### simple-eureka-provider
Eureka的客户端，服务的提供者

### simple-eureka-server
Eureka注册中心服务端

### simple-eureka-zuul
API路由网关