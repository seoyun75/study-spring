package com.example.hello.postAPI.controller;

import com.example.hello.postAPI.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/*
    회원 정보를 받아오는 등의 작업을 할때

    post로 들어오는 값들읇 받기위해서 @RequestBody 작성
* */
@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("post")
    public void post(@RequestBody Map<String, Object> requestData){
        requestData.forEach((key, value) -> {
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        });
    }

    @PostMapping("post02")
    public String post02(@RequestBody PostRequestDto requestData){
        System.out.println(requestData);
        return requestData.toString();
    }

}
