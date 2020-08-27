package com.atguigu.springcloud.config;

import org.mybatis.spring.annotation.*;
import org.springframework.context.annotation.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/26
 * @time: 12:43
 */
@Configuration
@MapperScan({"com.atguigu.springcloud.dao"})
public class MybatisConfig {
}
