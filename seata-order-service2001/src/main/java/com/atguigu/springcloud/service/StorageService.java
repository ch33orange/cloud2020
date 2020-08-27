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
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    /**
     * 减少库存
     * @param productId
     * @param count
     * @return
     */
    @PostMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);
}
