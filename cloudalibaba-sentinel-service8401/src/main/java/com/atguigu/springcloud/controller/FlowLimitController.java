package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.*;
import com.alibaba.csp.sentinel.slots.block.*;
import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/7/5
 * @time: 11:09
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
//        try {
//            TimeUnit.MILLISECONDS.sleep(800);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "---------testA";
    }


    @GetMapping("/testB")
    public String testB() {
        return "---------testB";
    }

    @GetMapping("/testD")
    public String testD() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("testD 测试RT");
//        int age = 1/0;
        return "---------testD";
    }

    @GetMapping("/testE")
    public String testE() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("testE 测试R异常数");
//        int age = 1/0;
        return "---------testE";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required =  false) String p1,
                             @RequestParam(value = "p2",required =  false) String p2){
//        int age = 10/0;
        return "----------testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException exception){
        return "-----------deal_testHotKey,o(╥﹏╥)o";
    }

}
