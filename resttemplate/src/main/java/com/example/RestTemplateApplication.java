package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author LvHao
 * @Description :
 * @date 2020-07-28 11:36
 */
@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class,args);
    }

    /**
     * 将RestTemplate注入
     * @return
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
