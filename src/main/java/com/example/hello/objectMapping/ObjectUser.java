package com.example.hello.objectMapping;

public class ObjectUser {
    private String name;
    private int age;

    public ObjectUser() {
        this.name = "";
        this.age = 0;
    }

    public ObjectUser(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
