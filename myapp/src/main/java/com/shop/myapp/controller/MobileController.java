package com.shop.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mobile/")
public class MobileController {

    @GetMapping("mobile.do")
    public String mobileMain() {
        return "/mobile/mobile";
    }
}
