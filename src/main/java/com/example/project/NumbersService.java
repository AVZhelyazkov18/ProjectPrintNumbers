package com.example.project;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class NumbersService {
    public static List<Integer> getNumbersFromN(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0) {
                numbers.add(i);
            }
        }
        return numbers;
    }
}
