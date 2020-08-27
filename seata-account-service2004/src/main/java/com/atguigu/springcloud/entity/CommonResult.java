package com.atguigu.springcloud.entity;

import lombok.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/26
 * @time: 12:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}