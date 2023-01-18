package com.example.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NumbersController {
    @GetMapping("/numbers")
    public String getNumbers(Model model, @RequestParam(value = "n", defaultValue = "0") int n, @RequestParam(value = "m", defaultValue = "2") int m) {
        model.addAttribute("numbers", NumbersService.getNumbersFromN(n));
        return "numbers";
    }

    @GetMapping("/sum-numbers")
    public String sumNumbers(Model model, @RequestParam(value = "n", defaultValue = "10") int n) {
        model.addAttribute("numbers", SumNumbersService.sum(n));
        return "numbers";
    }

    @GetMapping("/words")
    public String showWords(Model model, @RequestParam(value = "word", defaultValue = "Word") String word, @RequestParam(value = "n", defaultValue = "10") int n) {
        String fullWord = "";
        for (int i = 1; i < n; i++) {
            fullWord += (word + " ");
        }
        model.addAttribute("numbers", fullWord);
        return "numbers";
    }
}
