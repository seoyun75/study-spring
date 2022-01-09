package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {


    @GetMapping("query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {
        //query paramiter를 받는 방법 1
        //@RequestParam을 사용해 Map에 mappingg하여 사용

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    //query paramiter를 받는 방법 2
    @GetMapping("query-param-2")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ) {

        StringBuilder sb = new StringBuilder();


        sb.append("name = " + name + "\n");
        sb.append("email = " + email + "\n");
        sb.append("email = " + age + "\n");

        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return sb.toString();
    }

    //쿼리파라미터의 변수와 매칭을 통해 값을 넣어줌
    //query paramiter를 받는 방법 3
    //dto 객체를 활용한 mappring
    @GetMapping("query-param-3")
    public String queryParam02(UserRequest userRequest) {//어노테이션을 사용하지않음

        StringBuilder sb = new StringBuilder();


        sb.append("name = " + userRequest.getName() + "\n");
        sb.append("email = " + userRequest.getEmail() + "\n");
        sb.append("email = " + userRequest.getAge() + "\n");
        
        return sb.toString();
    }

}