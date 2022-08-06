package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//程序主入口 不能删也不能改，类似我们的main方法

//本身就是spring的一个组件，是一个可执行文件
@SpringBootApplication
public class HelloworldApplication {

    public static void main(String[] args) {
//        将springboot启动
        SpringApplication.run(HelloworldApplication.class, args);
    }

}
