package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.*;
import org.apache.ibatis.annotations.*;

/**
 * @author ch33orange
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}