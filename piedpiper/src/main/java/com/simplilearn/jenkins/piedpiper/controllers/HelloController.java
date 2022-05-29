package com.simplilearn.jenkins.piedpiper.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String getContract() {
        return "Greetings from Pied Piper Jenkins project!";
    }
}
