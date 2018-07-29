package com.example.teuddy2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping(value = "/jack")
    public String hey() {

        return "hello";
    }

}
