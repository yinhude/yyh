package com.www.yyh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ToHtmlController {

    @RequestMapping("/FileUpload")
    public String picUpload() {
        return "FileUpload";
    }
}