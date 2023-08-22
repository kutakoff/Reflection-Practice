package org.example;

import jdk.jfr.Name;

import java.lang.annotation.Target;

public class Student {

    @DeclarationTest("hello")
    private String name;

    private int age;

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