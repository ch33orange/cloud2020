package com.atguigu.springcloud;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.client.discovery.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/30
 * @time: 16:43
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class, args);
    }
}
