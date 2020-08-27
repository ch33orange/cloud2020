package com.atguigu.springcloud.entity;

import lombok.*;

import java.math.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/25
 * @time: 16:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeataOrder
{
    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    private Integer status; //订单状态：0：创建中；1：已完结
}