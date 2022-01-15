package com.example.hello.ch2.di;

import java.util.Base64;

public class BaseEncoder implements IEncoder{
    @Override
    public String encoding(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
