package com.zhq.ribbon.service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author : ZHQ
 * @date : 2020/3/22
 */
@EnableEurekaClient
@SpringBootApplication
public class RibbonServiceDemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(
                        RibbonServiceDemoApplication.class, args);
    }
}
