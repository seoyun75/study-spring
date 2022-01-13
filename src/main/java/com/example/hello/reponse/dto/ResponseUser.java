package com.example.hello.reponse.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

//값에 대한 설정. null에 대한 값을 받지 않을때 사용
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseUser {
    private String name;
    private int age;//기본 0. null로 받고싶은 경우 Integer(Rapper)
    private String phoneNumber;
    private String address;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
