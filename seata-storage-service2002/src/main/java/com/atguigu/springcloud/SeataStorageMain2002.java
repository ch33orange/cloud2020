package com.atguigu.springcloud;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.*;
import org.springframework.cloud.client.discovery.*;
import org.springframework.cloud.openfeign.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/25
 * @time: 15:37
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
@EnableDiscoveryClient
public class SeataStorageMain2002 {
    public static void main(String[] args) {
        SpringApplication.run(SeataStorageMain2002.class, args);
    }
}
