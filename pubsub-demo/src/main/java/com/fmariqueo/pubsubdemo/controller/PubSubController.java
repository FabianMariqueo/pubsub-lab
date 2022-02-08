package com.fmariqueo.pubsubdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PubSubController {
    
    @GetMapping("/")
    public String root(){
        return "hello world";
    }
}
