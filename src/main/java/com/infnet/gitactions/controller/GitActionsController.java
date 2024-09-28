package com.infnet.gitactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitActionsController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Olá mundo!";
    }

    @GetMapping("/actions")
    public String firstTest() {
        return "Primeiro teste do GitActions!";
    }
}
