package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping("/hello")
    String hello(){
        System.out.println("Hello");
        return "Hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    String hi(){
        return "hi";
    }


}