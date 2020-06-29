package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/27
 * @time: 17:51
 */
public interface PaymentService {

    static  AtomicInteger count = new AtomicInteger(0);

    public String paymentInfo_OK(Integer id);

    public String paymentInfo_TimeOut(Integer id);

    public String paymentInfo_TimeOutHandler(Integer id);

    public String paymentCircuitBreaker(@PathVariable("id") Integer  id);

    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id);
}
