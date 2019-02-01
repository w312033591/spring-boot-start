package com.iflytek.controller;

import com.iflytek.pojo.IMoocJSONResult;
import com.iflytek.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Object Hello() {
        return "hello spring_boot";
    }

    @RequestMapping("/resource")
    public IMoocJSONResult Resource() {
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);
        return IMoocJSONResult.ok(bean);
    }

}
