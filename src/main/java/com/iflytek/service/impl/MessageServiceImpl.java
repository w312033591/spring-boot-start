package com.iflytek.service.impl;

import com.github.pagehelper.PageHelper;
import com.iflytek.mapper.MessageMapper;
import com.iflytek.mapper.MessageMapperCustom;
import com.iflytek.pojo.Message;
import com.iflytek.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    public MessageMapper messageMapper;

    @Autowired
    public MessageMapperCustom messageMapperCustom;

    @Override
    public List<Message> getAllMessage() {
        List<Message> messages = messageMapper.selectAll();
        return messages;
    }

    @Override
    public List<Message> queryMessageListPage(Message message, Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);

        Example example = new Example(Message.class);
        Example.Criteria criteria = example.createCriteria();

        example.orderBy("id").desc();
        List<Message> messageList = messageMapper.selectByExample(example);

        return messageList;
    }

    @Override
    public List<Message> queryMessageSimpleInfoById(Integer id) {
        List<Message> messageList = messageMapperCustom.queryMessageSimpleInfoById(id);
        return messageList;
    }
}
