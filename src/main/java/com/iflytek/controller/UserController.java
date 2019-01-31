package com.iflytek.controller;

import com.iflytek.pojo.IMoocJSONResult;
import com.iflytek.pojo.User;
import com.iflytek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/save")
    public IMoocJSONResult saveUser() throws Exception {
        User user = new User();
        user.setId(99);
        user.setUsername("高立");
        userService.save(user);
        return IMoocJSONResult.ok();
    }

    @RequestMapping("/deleteUser")
    public IMoocJSONResult deleteUser() {
        userService.deleteUser(1);
        return IMoocJSONResult.ok();
    }

    @RequestMapping("/getAllUser")
    public IMoocJSONResult getAllUser() {
        List<User> userList = userService.queryUserList();
        return IMoocJSONResult.ok(userList);
    }
}
