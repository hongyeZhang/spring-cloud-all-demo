package com.zhq.feign.client.demo;

import com.zhq.all.api.feign.HelloFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : ZHQ
 * @date : 2020/3/20
 */

@EnableFeignClients(clients = {HelloFeign.class})
//@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages ={"com.zhq.feign.client.demo","com.zhq.all.api.feign"} )
public class FeignClientDemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FeignClientDemoApplication.class,
                        args);
    }
}

