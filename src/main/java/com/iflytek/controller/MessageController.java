package com.iflytek.controller;

import com.iflytek.pojo.IMoocJSONResult;
import com.iflytek.pojo.Message;
import com.iflytek.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("message")
public class MessageController {

    @Autowired
    public MessageService messageService;

    @RequestMapping("/getAll")
    public IMoocJSONResult getAllMessage() {
        List<Message> messageList = messageService.getAllMessage();
        return IMoocJSONResult.ok(messageList);
    }

    @RequestMapping("/getMessageByPage")
    public IMoocJSONResult queryMessageListPagesd(Integer page) {
        if (page == null) {
            page = 1;
        }
        int pageSize = 10;
        Message message = new Message();
        List<Message> messageList = messageService.queryMessageListPage(message, page, pageSize);
        return IMoocJSONResult.ok(messageList);
    }

    @RequestMapping("/querySimpleInfoById")
    public IMoocJSONResult querySimpleInfoById(Integer id) {

        return IMoocJSONResult.ok(messageService.queryMessageSimpleInfoById(id));
    }
}
