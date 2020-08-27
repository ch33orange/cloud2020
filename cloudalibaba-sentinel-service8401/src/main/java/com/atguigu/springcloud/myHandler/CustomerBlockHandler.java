package com.atguigu.springcloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.*;
import com.atguigu.springcloud.entities.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/23
 * @time: 16:18
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException excption){
        return new CommonResult(444,"按客户自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException excption){
        return new CommonResult(444,"按客户自定义,global handlerException----2");
    }
}
