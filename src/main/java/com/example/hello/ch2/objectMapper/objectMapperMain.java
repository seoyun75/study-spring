package com.example.hello.ch2.objectMapper;

import com.example.hello.ch2.objectMapper.dto.ObjectMapperCar;
import com.example.hello.ch2.objectMapper.dto.ObjectMapperUser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.Arrays;
import java.util.List;

public class objectMapperMain {

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("main");
        ObjectMapper objectMapper =new ObjectMapper();

        ObjectMapperUser user = new ObjectMapperUser();

        user.setName("홍길동");
        user.setAge(25);

        ObjectMapperCar car1 = new ObjectMapperCar();
        car1.setCarNumber("11가 1243");
        car1.setName("k5");
        car1.setType("sedan");

        ObjectMapperCar car2 = new ObjectMapperCar();
        car2.setCarNumber("11가 7890");
        car2.setName("Q5");
        car2.setType("suv");

        List<ObjectMapperCar> carList = Arrays.asList(car1,car2);
        user.setCarList(carList);

        //일반적인 출력값
        //User{name='홍길동', age=25, carList=[Car{name='k5', carNumber='11가 1243', type='sedan'}, Car{name='Q5', carNumber='11가 7890', type='suv'}]}
        System.out.println(user);

        //json 형식으로 변환한 String 값 확인
        //{"name":"홍길동","age":25,"carList":[{"name":"k5","carNumber":"11가 1243","type":"sedan"},{"name":"Q5","carNumber":"11가 7890","type":"suv"}]}
        String json = objectMapper.writeValueAsString(user);
        System.out.println(json);

        //json 파일을 node 형태로 가져옴
        JsonNode jsonNode = objectMapper.readTree(json);
        jsonNode.get("name").asText();
        jsonNode.get("age").asInt();

        //json 내부의 배열은 하나의 토큰이기 때문에 ArrayNode에 넣어준후 object mapper를 통해 list 로 변환
        //원하는 객체, type 을 파라미터로 받음
        ArrayNode arrayNode = (ArrayNode)jsonNode.get("carList");
        List<ObjectMapperCar> _cars = objectMapper.convertValue(arrayNode, new TypeReference<List<ObjectMapperCar>>() {});

        //JsonNode에 들어있는 값을 변경할때 사용
        ObjectNode objectNode = (ObjectNode) jsonNode;
        objectNode.put("name","seller");
        objectNode.put("age","30");
    }
}
