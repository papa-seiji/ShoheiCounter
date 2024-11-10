package com.example.shoheicounter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Shohei Counter App!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
