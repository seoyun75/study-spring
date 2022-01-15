package com.example.hello.ch2.di;

public class DiMain {

    public void main(){
        String url = "https://www.naver.com/";
        String result = "";

        //DI
        //Encoder의 매개변수로 원하는 인코딩 방식의 클래스를 입력
        //Main에서 객체를 할당. Encoder에 의존성 주입(DI)
        Encoder encoder = new Encoder(new BaseEncoder());
//        Encoder encoder = new Encoder(new UrlEncoder());
        result = encoder.encoding(url);

        System.out.println(encoder.getClass().getSimpleName() +" : " + result);
    }
}
