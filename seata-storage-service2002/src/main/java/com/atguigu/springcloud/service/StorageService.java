package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.*;
import org.springframework.cloud.openfeign.*;
import org.springframework.web.bind.annotation.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/25
 * @time: 16:21
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
