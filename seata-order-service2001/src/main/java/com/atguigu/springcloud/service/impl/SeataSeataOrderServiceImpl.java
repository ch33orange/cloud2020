package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.*;
import com.atguigu.springcloud.entity.*;
import com.atguigu.springcloud.service.*;
import io.seata.spring.annotation.*;
import lombok.extern.slf4j.*;
import org.springframework.stereotype.*;

import javax.annotation.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/25
 * @time: 16:21
 */
@Service
@Slf4j
public class SeataSeataOrderServiceImpl implements SeataOrderService {

    @Resource
    private SeataOrderDao seataOrderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    /**
     * 业务逻辑
     *
     * @param seataOrder
     */
    @Override
    @GlobalTransactional(name = "bluer-create-order",rollbackFor = Exception.class)
    public void createOrder(SeataOrder seataOrder) {
        log.info("------------->开始新建订单");
        //1.新建订单
        seataOrderDao.createOrder(seataOrder);

        //2.减少库存
        log.info("--------------->订单微服务开始调用减少库存操作start");
        storageService.decrease(seataOrder.getProductId(), seataOrder.getCount());
        log.info("--------------->订单微服务开始调用减少库存操作end");
        //3.账户扣钱
        log.info("--------------->订单微服务开始调用账户扣钱操作start");
        accountService.decrease(seataOrder.getUserId(), seataOrder.getMoney());
        log.info("--------------->订单微服务开始调用账户扣钱操作end");

        //4.修改订单状态 从0-1 1表示已结束
        log.info("--------------->订单微服务开始调用修改订单状态操作start");
        seataOrderDao.updateOrder(seataOrder.getUserId(),0);
        log.info("--------------->订单微服务开始调用修改订单状态操作end");

        log.info("--------------->下订单结束啦!!!!,O(∩_∩)O哈哈~");
    }


}
