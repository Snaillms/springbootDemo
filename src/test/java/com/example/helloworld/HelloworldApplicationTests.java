package com.example.helloworld;

import com.example.helloworld.polo.Dog;
import com.example.helloworld.polo.Person;
import com.example.helloworld.polo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloworldApplicationTests {
    @Autowired //将狗狗自动注入进来
    Dog dog;
    @Autowired
    Person person; //将person自动注入进来
    @Autowired
    User user;

    @Test
    void contextLoads() {
        System.out.println(dog); //打印看下狗狗对象
        System.out.println(person); //打印person信息
        System.out.println(user);
    }

    @Test
    void test1(){

    }
}
