package com.example.taskmanager.controller;

import com.example.taskmanager.service.StringService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/strings")
public class StringController {
    private final StringService stringService;

    public StringController(StringService stringService) {
        this.stringService = stringService;
    }

    @GetMapping("/reverse")
    public String reverse(@RequestParam String input) {
        return stringService.reverse(input);
    }

    @GetMapping("/count-vowels")
    public long countVowels(@RequestParam String input) {
        return stringService.countVowels(input);
    }

    @GetMapping("/convert-case")
    public String convertCase(@RequestParam String input) {
        return stringService.convertCase(input);
    }
}
