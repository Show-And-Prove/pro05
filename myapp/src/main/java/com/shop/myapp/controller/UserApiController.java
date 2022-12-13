package com.shop.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserApiController {

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false, defaultValue = "guest") String name) {
        return "hello " + name;
    }
}