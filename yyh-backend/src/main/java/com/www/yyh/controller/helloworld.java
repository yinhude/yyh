package com.www.yyh.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
    @GetMapping(value = "/hello")
    public String hello(){
        return "helloworld";
    }
}
