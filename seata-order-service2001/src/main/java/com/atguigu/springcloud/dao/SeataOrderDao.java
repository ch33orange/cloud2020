package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entity.SeataOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/25
 * @time: 15:41
 */
@Mapper
public interface SeataOrderDao {

    /**
     * 创建订单
     * @param seataOrder
     */
    void createOrder(SeataOrder seataOrder);

    /**
     * 更新修改订单状态 从0到1
     * @param userId
     * @param status
     */
     void updateOrder(@Param("userId") Long userId,@Param("status") Integer status);

}
