package com.golfzonacademy.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
