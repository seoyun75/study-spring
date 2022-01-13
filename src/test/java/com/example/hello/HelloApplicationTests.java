package com.example.hello;

import com.example.hello.objectMapping.ObjectUser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("hello");

        //Test JSON -> Object
        var objectMapper = new ObjectMapper();

        //object가 text로 바뀔때는 object mapper 가 get method를 활용한다.
        var user = new ObjectUser("jay", 30);
        var text = objectMapper.writeValueAsString(user);

        //text가 object로 바뀔때는 default생성자를 필요로 한다.
        var objectUser = objectMapper.readValue(text, ObjectUser.class);
        System.out.println(objectUser);

        //ObjectMapper가 참조하는 클래스에는 getter를 제외한 메소드명에 get을 사용하면 오류발생

    }

}
