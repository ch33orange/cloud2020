package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entity.*;
import org.apache.ibatis.annotations.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/25
 * @time: 15:41
 */
@Mapper
public interface StorageDao {


    /**
     * 减少库存
     * @param productId
     * @param count
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
