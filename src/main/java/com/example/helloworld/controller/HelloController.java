package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//自动装配
@RestController
public class HelloController {

    //    接口：http://localhost:8080/hello
    @RequestMapping("/hello")
    public String hello() {
//      调用业务，接收前端的参数
        System.out.println("jjjjjjjj");
        System.out.println("hhhhh");
        return "hello,world";
    }
}
