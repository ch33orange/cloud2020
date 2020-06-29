package com.atguigu.springcloud.filtter;

import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.cloud.gateway.filter.*;
import org.springframework.core.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.server.*;
import reactor.core.publisher.*;
import org.apache.commons.lang3.StringUtils;
import java.util.*;

/**
 * @email chivseg-hao@qq.com
 * @author:ch33orange
 * @date: 2020/6/29
 * @time: 15:16
 */
@Component
@Slf4j
public class MyGateWayFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("******************come in MyLogGateWayFilter:   "+new Date());
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if( StringUtils.isNoneBlank(username) ){
            log.info("******用户名为null,非法用户,o(╥﹏╥)o");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
