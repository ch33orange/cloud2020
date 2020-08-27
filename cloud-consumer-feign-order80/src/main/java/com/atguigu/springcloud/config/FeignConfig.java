package com.atguigu.springcloud.config;

import feign.*;
import org.springframework.context.annotation.*;


/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/27
 * @time: 15:24
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
