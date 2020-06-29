package com.atguigu.springcloud.service.impl;

import cn.hutool.core.util.*;
import com.atguigu.springcloud.service.*;
import com.netflix.hystrix.contrib.javanica.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import javax.naming.*;
import java.util.concurrent.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/27
 * @time: 17:52
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    //==========服务降级


    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池： " + Thread.currentThread().getName() + "\t" + "   paymentInfo_OK(),id:    " + id + "\t" +
                "\"成功返回 O(∩_∩)O 哈哈哈";
    }

    /**
     * 超时保护
     * @param id
     * @return
     */
    @Override
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value="5000")
    })
    public String paymentInfo_TimeOut(Integer id) {
//        System.out.println("第" + count.getAndIncrement() + "请求");
        Integer timeOutNumber = 1;
//         int age  = 10/0;
        try {TimeUnit.SECONDS.sleep(timeOutNumber);} catch (InterruptedException e) {e.printStackTrace();}
        return "线程池:  " + Thread.currentThread().getName() + "   paymentInfo_OK(),id:    " + id + "\t" +
                "O(∩_∩)O哈哈~" + "  耗时(秒): " + timeOutNumber;
    }

    @Override
    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池:  " + Thread.currentThread().getName() + "   paymentInfo_OK(),id:    " +
                id + "\t" + "  8001系统繁忙或者运行报错，请稍后再试," + "o(╥﹏╥)o";
    }

    //==========服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),// 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),// 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),// 失败率达到多少后跳闸
    })
    @Override
    public String paymentCircuitBreaker(Integer  id) {
        if(id < 0)
        {
            throw new RuntimeException("******id 不能负数");
        }
        String serialNumber = IdUtil.simpleUUID();

        return Thread.currentThread().getName()+"\t"+"调用成功，流水号: " + serialNumber;
    }

    @Override
    public String paymentCircuitBreaker_fallback(Integer id) {
        return "id 不能负数，请稍后再试，/(ㄒoㄒ)/~~   id: " +id;
    }


}
