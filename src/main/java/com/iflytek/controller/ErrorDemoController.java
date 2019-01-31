package com.iflytek.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorDemoController {

    @RequestMapping("errorDemo")
    public int errorDemo() {
        int a = 1/0;
        return a;
    }
}
