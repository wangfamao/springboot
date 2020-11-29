package com.entor.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangfm
 * @create 2020-11-29  11:00
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!!";
    }

    @GetMapping("/getPort")
    public String getPort(){
        return "服务器端口："+port;
    }
}
