package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.*;
import com.atguigu.springcloud.service.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/25
 * @time: 16:39
 */
@RestController
public class SeataOrderController {

    @Resource
    private SeataOrderService seataOrderService;


    @GetMapping("/order/create")
    public CommonResult create(SeataOrder seataOrder){
        seataOrderService.createOrder(seataOrder);
        return new CommonResult(200,"订单创建成功");
    }
}
