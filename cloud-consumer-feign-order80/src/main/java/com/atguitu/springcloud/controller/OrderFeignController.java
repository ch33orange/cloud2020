package com.atguitu.springcloud.controller;

import com.atguigu.springcloud.entities.*;
import com.atguitu.springcloud.service.*;
import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/27
 * @time: 14:58
 */
@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentOpenFeignService;

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentOpenFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() {
        //openfeign-ribbon,客户端一般默认等待一秒钟
        return paymentOpenFeignService.paymentFeignTimeout();
    }
}
