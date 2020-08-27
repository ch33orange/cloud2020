package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.*;
import org.springframework.cloud.openfeign.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/27
 * @time: 14:52
 */
@Service
@FeignClient(value = "cloud-provider-hystrix-payment")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value =  "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
