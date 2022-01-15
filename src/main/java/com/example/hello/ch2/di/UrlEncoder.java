package com.example.hello.ch2.di;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlEncoder implements IEncoder{
    @Override
    public String encoding(String message) {
        try {
            return URLEncoder.encode(message,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
