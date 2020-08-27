package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.*;
import com.atguigu.springcloud.service.*;

import org.slf4j.*;
import org.springframework.stereotype.*;

import javax.annotation.*;


/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/25
 * @time: 17:08
 */
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;


    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存start");
        storageDao.decrease(productId,count);
        LOGGER.info("------->storage-service中扣减库存end");
    }
}
