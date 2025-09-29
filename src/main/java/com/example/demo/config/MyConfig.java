package com.example.demo.config;

import com.example.demo.ppp.Role3;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    @ConfigurationProperties(prefix = "mrole")
    public Role3 getrole3() {
        return new Role3();
    }
}
