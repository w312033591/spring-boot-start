package com.iflytek.service;

import com.iflytek.pojo.Message;
import com.iflytek.pojo.User;

import java.util.List;

public interface MessageService {

    public List<Message> getAllMessage();

    public List<Message> queryMessageListPage(Message message, Integer page, Integer pageSize);

    public List<Message> queryMessageSimpleInfoById(Integer id);
}
