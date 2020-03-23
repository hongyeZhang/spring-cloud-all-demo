package com.zhq.gateway.zuul.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author : ZHQ
 * @date : 2020/3/22
 */
@EnableZuulProxy
@SpringBootApplication
public class GatewayZuulDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulDemoApplication.class, args);
    }
}
