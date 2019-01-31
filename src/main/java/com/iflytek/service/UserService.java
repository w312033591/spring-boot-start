package com.iflytek.service;

import com.iflytek.pojo.User;

import java.util.List;

public interface UserService {

    public void save(User user) throws Exception;

    public void updateUser(User user);

    public void deleteUser(int userId);

    public User queryUserById(String userId);

    public List<User> queryUserList();

}
