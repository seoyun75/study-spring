package com.example.hello.reponse.controller;

import com.example.hello.reponse.dto.ResponseUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
//response : 응답, 호응
public class ResponseApiController {
    //JSON
    //req-> abject mapper -> object -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public ResponseUser json(@RequestBody ResponseUser user){
        return user; // 정상적인 요청인 경우 200 ok
    }

    //put 으로 생성(201)의 경우.
    //값을 return 할때 ResponseEntity를 사용하여 json형식으로 정확하게 보내는 것을 권장
    //디테일하게는 header값도 변경 가능
    @PutMapping("/response-put")
    public ResponseEntity<ResponseUser> put(@RequestBody ResponseUser user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }


}
