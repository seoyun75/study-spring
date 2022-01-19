package com.example.hello.ch2.objectMapper.dto;

import java.util.ArrayList;
import java.util.List;

public class ObjectMapperUser {
    private String name;
    private int age;
    List<ObjectMapperCar> carList = new ArrayList<>();

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

    public List<ObjectMapperCar> getCarList() {
        return carList;
    }

    public void setCarList(List<ObjectMapperCar> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carList=" + carList +
                '}';
    }
}
