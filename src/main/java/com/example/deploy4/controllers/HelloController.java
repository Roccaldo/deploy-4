package com.example.deploy4.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${welcomeMsg2}")
    private String prodMsg;

    @Value("${welcomeMsg}")
    private String testMsg;

    @GetMapping("/prod")
    public String sayHelloProd() {
        return prodMsg;
    }

    @GetMapping("/test")
    public String sayHelloTest() {
        return testMsg;
    }
}
