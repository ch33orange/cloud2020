package com.atguiigu.springcloud.controller;

import com.atguiigu.springcloud.service.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/30
 * @time: 11:25
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }

}
