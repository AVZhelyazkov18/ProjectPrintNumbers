package com.example.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SpringController {
    @GetMapping("/print-numbers")
    public String getNumbers(Model model, @RequestParam(value = "n", defaultValue = "10") int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        model.addAttribute("numbers", numbers);
        return "numbers";
    }
}