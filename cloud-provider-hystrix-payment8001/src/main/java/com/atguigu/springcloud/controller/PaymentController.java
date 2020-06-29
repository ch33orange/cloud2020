package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.*;
import com.atguigu.springcloud.service.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/27
 * @time: 18:00
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("server.port")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id ){
        String result = paymentService.paymentInfo_OK(id);
        log.info("*********result: " + result);
        return result;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id ){
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("*********result: " + result);
        return result;
    }

    //=====服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id ){
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("*********result: " + result);
        return result;
    }



}
