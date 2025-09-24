package com.example.demo.ppp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Role1 {
    @Value("${mrole.name}")
    public String name;
    @Value("${mrole.desc}")
    public String desc;


}
