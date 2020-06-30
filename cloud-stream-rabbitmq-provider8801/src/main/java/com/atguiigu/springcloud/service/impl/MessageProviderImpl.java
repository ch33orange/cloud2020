package com.atguiigu.springcloud.service.impl;

import com.atguiigu.springcloud.service.*;
import org.springframework.cloud.stream.annotation.*;
import org.springframework.cloud.stream.messaging.*;
import org.springframework.integration.support.*;
import org.springframework.messaging.*;

import javax.annotation.*;
import java.util.*;


/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/30
 * @time: 11:23
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;

    public MessageProviderImpl(MessageChannel output) {
        this.output = output;
    }

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("****************serial:"+serial);
        return serial;
    }
}
