package com.example.hello.ch2.di;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DiMainTest {

    @Test
    public void mainTest(){
        DiMain diMain = new DiMain();

        diMain.main();
    }
}
