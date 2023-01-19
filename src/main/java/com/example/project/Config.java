package com.example.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public SumNumbersService sumNumbersService() {
        return new SumNumbersService();
    }
}
