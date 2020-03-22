package com.zhq.sleuthtraceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZHQ
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SleuthTraceOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthTraceOneApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate getRestemplate() {
        return new RestTemplate();
    }

}
