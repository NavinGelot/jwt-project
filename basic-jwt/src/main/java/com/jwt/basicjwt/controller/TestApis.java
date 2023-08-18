package com.jwt.basicjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestApis {

    @GetMapping("/public")
    public String publicApi() {
        return "Yeah it worked: PUBLIC API ACCESS";
    }

    @GetMapping("/private")
    public String privateApi() {
        return "Yeah it worked: PRIVATE API ACCESS";
    }

}
