package com.atguitu.springcloud.config;

import org.springframework.context.annotation.*;
import org.springframework.web.client.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/23
 * @time: 11:33
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
/**
 * applicationContext.cml <bean id=" class="></bean>
 */
