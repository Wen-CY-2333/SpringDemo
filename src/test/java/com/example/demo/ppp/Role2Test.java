package com.example.demo.ppp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Role2Test {
    @Autowired
    private Role2 role1;

    @Test
    public void test(){
        System.out.println(role1.name);
        System.out.println(role1.desc);
    }
}