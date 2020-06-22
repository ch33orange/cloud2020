package com.atguigu.springcloud.entities;

import lombok.*;

/**
 * @author ch33orange
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    //404 not_found

    private Integer code;
    private String message;
    private T data;

    /**
     * 补充一个构造器
     * @param code
     * @param message
     */
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }


}
