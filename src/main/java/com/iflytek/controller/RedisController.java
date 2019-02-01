package com.iflytek.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.iflytek.pojo.IMoocJSONResult;
import com.iflytek.pojo.User;
import com.iflytek.utils.JsonUtils;
import com.iflytek.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisOperator redisOperator;

    @RequestMapping("/testRedis")
    public IMoocJSONResult test() {
        stringRedisTemplate.opsForValue().set("demo", "ligao8");
        String demoVal = stringRedisTemplate.opsForValue().get("demo");
        return IMoocJSONResult.ok(demoVal);
    }

    @RequestMapping("/testRedisOperator")
    public IMoocJSONResult testOparator() {

        User user1 = new User();
        user1.setId(1);
        user1.setUsername("ligao8");


        User user2 = new User();
        user2.setId(2);
        user2.setUsername("ligao9");

        User user3 = new User();
        user3.setId(3);
        user3.setUsername("ligao10");

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        redisOperator.set("demo2", JsonUtils.objectToJson(userList));
        List<User> jsonToList = JsonUtils.jsonToList(redisOperator.get("demo2"), User.class);
        return IMoocJSONResult.ok(jsonToList);
    }

}
