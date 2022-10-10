package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springboottestscontroller {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value="MyName", defaultValue ="Wolrd") String name){
        return String.format("Hello %s!", name);
    }
}
