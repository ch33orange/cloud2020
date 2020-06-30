package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.cloud.stream.annotation.*;
import org.springframework.cloud.stream.messaging.*;
import org.springframework.messaging.*;
import org.springframework.web.bind.annotation.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/30
 * @time: 11:48
 */
@RestController
@EnableBinding(Sink.class) //消息通道接收
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("消费者1号,--------->接收到的消息: " + message.getPayload() + "\t serverPort" + serverPort);
    }

}
