package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LvHao
 * @Description :
 * @date 2020-07-28 20:09
 */
@RestController
@RequestMapping("/native")
public class NativeConfigController {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index(){
        return this.port + "-" + this.foo;
    }
}
