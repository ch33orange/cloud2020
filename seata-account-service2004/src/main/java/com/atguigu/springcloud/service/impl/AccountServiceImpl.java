package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.*;
import com.atguigu.springcloud.service.*;
import lombok.extern.slf4j.*;
import org.slf4j.*;
import org.springframework.stereotype.*;

import javax.annotation.*;
import java.math.*;
import java.util.concurrent.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/26
 * @time: 12:44
 */
@Service
@Slf4j
public class AccountServiceImpl implements SeataAccountService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);


    @Resource
    AccountDao accountDao;

    /**
     * 扣减账户余额
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------->account-service中扣减账户余额开始");
        //模拟超时异常，全局事务回滚
        //暂停几秒钟线程
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountDao.decrease(userId, money);
        LOGGER.info("------->account-service中扣减账户余额结束");
    }
}
