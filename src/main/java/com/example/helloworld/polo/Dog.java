package com.example.helloworld.polo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //注册bean到容器中
public class Dog {
    @Value("阿黄")
    private String name;
    @Value("18")
    private Integer age;
        //有参无参构造、get、set方法、toString()方法
    public Dog() {

    }
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dog{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}



