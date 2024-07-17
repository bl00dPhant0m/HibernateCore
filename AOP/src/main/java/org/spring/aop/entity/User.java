package org.spring.aop.entity;

import lombok.extern.slf4j.Slf4j;
import org.spring.aop.annotations.Loggable;

@Slf4j
@Loggable
public class User {
    private String name;
    private int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
