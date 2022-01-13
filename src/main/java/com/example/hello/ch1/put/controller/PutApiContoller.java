package com.example.hello.put.controller;

import com.example.hello.put.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiContoller {

    @PutMapping("/put")
    public void put(@RequestBody PutRequestDto postDto){
        System.out.println(postDto);
    }

    @PutMapping("/put/{userId}")
    public void putPathVariable(@RequestBody PutRequestDto postDto,
                                @PathVariable Long userId //메소드에 선언한 이름과 일치 혹은 @PathVariable(name = userId)
    ){
        System.out.println(postDto);
    }
}
