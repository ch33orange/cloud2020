package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/25
 * @time: 15:41
 */
@Mapper
public interface AccountDao {

    void decrease(@Param("userId")Long userId,@Param("money")BigDecimal money);
}
