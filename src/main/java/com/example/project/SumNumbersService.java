package com.example.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SumNumbersService {
    @Bean
    public static int sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n;
            n--;
        }
        return sum;
    }

}
