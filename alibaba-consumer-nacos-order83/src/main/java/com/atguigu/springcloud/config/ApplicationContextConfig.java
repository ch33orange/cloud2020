package com.atguigu.springcloud.config;


import org.springframework.cloud.client.loadbalancer.*;
import org.springframework.context.annotation.*;
import org.springframework.web.client.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/30
 * @time: 17:05
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
