package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.*;
import com.atguigu.springcloud.entities.*;
import com.atguigu.springcloud.service.*;
import org.springframework.stereotype.*;

import javax.annotation.*;

/**
 * @author ch33orange
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }


}
