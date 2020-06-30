package com.atguiigu.springcloud;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/30
 * @time: 11:21
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMqMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMqMain8001.class, args);
    }
}
