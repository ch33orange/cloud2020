package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.*;
import org.apache.ibatis.annotations.*;

/**
 * @author ch33orange
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

