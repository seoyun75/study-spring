package com.example.hello.reponse.controller;

import com.example.hello.reponse.dto.ResponseUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//html페이지 리소스를 찾음
@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    //responseEntity

    //ResponseBody
    //타입을 추론
    @ResponseBody
    @GetMapping("/user")
    public ResponseUser user(){

        var user = new ResponseUser();
        user.setName("jay");
        user.setAddress("Seoul");
        return user;
    }
}
