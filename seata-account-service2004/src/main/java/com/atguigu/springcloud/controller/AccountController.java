package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.*;
import com.atguigu.springcloud.service.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.*;
import java.math.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/26
 * @time: 12:44
 */
@RestController
public class AccountController {

    @Resource
    private SeataAccountService accountService;

    /**
     * 扣减余额
     *
     * @param userId
     * @param money
     * @return
     */
    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult(200, "账户扣减余额成功!!!!");
    }
}
