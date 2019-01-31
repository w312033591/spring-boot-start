package com.iflytek.mapper;

import com.iflytek.pojo.Message;
import com.iflytek.utils.MyMapper;

import java.util.List;

public interface MessageMapperCustom {
    List<Message> queryMessageSimpleInfoById(Integer id);

}