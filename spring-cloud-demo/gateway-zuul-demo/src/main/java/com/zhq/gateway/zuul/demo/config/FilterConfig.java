package com.zhq.gateway.zuul.demo.config;

import com.zhq.gateway.zuul.demo.filter.RequestFilter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : ZHQ
 * @date : 2020/3/23
 */
@Configuration
public class FilterConfig {

    @Bean
    public RequestFilter filter() {
        return new RequestFilter();
    }
}
