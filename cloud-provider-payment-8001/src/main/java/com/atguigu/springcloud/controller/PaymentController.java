package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.*;
import com.atguigu.springcloud.service.*;
import lombok.extern.java.*;
import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.*;

/**
 * @author ch33orange
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;


    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("***插入结果:" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功!", result);
        } else {
            return new CommonResult(200, "插入数据库成功!", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("***根据Id查询结果:" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功!", payment);
        } else {
            return new CommonResult(200, "没有对应记录!", null);
        }
    }


}
