package com.zhq.sleuthtracetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author ZHQ
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SleuthTraceTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthTraceTwoApplication.class, args);
    }

}
