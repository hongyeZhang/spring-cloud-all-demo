package com.zhq.hystrix.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author : ZHQ
 * @date : 2020/3/22
 */
@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
@ServletComponentScan
public class HystrixWebDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixWebDemoApplication.class, args);
    }
}
