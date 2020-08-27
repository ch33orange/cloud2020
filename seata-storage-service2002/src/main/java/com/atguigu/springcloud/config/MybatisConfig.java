package com.atguigu.springcloud.config;

import org.mybatis.spring.annotation.*;
import org.springframework.context.annotation.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/25
 * @time: 15:42
 */
@Configuration
@MapperScan({"com.atguigu.springcloud.dao"})
public class MybatisConfig {
}
