package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.entities.*;
import com.atguigu.springcloud.service.*;
import org.springframework.stereotype.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/23
 * @time: 16:57
 */
@Service
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}