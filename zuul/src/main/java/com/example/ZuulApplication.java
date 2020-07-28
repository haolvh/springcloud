package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author LvHao
 * @Description :
 * @EnableZuulProxy: 包含了@EnableZuulServer,设置该类是网关的启动类
 * @EnableAutoConfiguration： 可以帮助Spring Boot应用将所有符合条件的Configuration配置加载到当前Spring Boot创建并使用的Ioc容器中
 * @date 2020-07-28 17:21
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
