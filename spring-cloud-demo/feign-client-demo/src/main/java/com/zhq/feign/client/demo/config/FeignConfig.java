package com.zhq.feign.client.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

/**
 * @Author: ZHQ
 * @description:
 * @Date: 2019/12/24 12:04
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLevel() {
        return Logger.Level.FULL;
    }
}
