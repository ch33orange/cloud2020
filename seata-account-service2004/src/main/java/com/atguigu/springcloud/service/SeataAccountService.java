package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.*;

import java.math.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/26
 * @time: 12:44
 */
public interface SeataAccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(Long userId, BigDecimal money);
}
