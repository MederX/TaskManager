package com.example.taskmanager.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public long countVowels(String input) {
        return input.chars().filter(ch -> "aeiouAEIOU".indexOf(ch) >= 0).count();
    }

    public String convertCase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.isUpperCase(chars[i]) ?
                    Character.toLowerCase(chars[i]) :
                    Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}
