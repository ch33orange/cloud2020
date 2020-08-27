package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.*;
import com.netflix.hystrix.contrib.javanica.annotation.*;
import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/27
 * @time: 18:35
 */
@RestController
@Slf4j
@RequestMapping("/consumer")
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfo_OK(id);
        return result;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value="1500")
//    })
    @HystrixCommand
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
//        int age = 10/0;
        String result = paymentHystrixService.paymentInfo_TimeOut(id);
        return result;
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "我是消费之80，对方支付系统繁忙，请10秒钟后再试或者自己运行出错请检查自己！o(╥﹏╥)o";
    }

    //下面是全局fallback

    public String payment_Global_FallbackMethod(){
        return "Global异常处理信息，请10秒钟后再试！o(╥﹏╥)o";
    }


}
