package com.example.hello.ch2.di;

//의존성 주입
//인코더 인스턴스를 DiMain 에서 설정(UrlEncoder or BaseEncoder or another)
public class Encoder implements IEncoder{
    private IEncoder encoder;

    public Encoder(IEncoder encoder){
        this.encoder = encoder;
    }

    @Override
    public String encoding(String message) {
        return encoder.encoding(message);
    }
}
