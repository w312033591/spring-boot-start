package com.iflytek.controller.interceptor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("one")
public class OneController {

    @RequestMapping("/testOneInterceptor")
    public String testOneInterceptor() {
        System.out.println("testOneInterceptor");
        return "testOneInterceptor";
    }
}
