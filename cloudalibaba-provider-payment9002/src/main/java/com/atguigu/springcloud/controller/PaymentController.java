package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/30
 * @time: 16:44
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos registry, serverPort: " + serverPort + "\t" + "id: " + id;

    }
}
