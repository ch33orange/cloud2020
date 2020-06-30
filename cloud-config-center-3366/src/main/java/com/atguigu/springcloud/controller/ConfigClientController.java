package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.cloud.context.config.annotation.*;
import org.springframework.web.bind.annotation.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/30
 * @time: 10:24
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return "serverPort: " + serverPort + "\t\n\n   configInfo:  " + configInfo;
    }
}
