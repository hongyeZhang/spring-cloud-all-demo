package com.zhq.all.api.feign.hystrix;


import com.zhq.all.api.feign.HelloFeign;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @author : ZHQ
 * @date : 2020/3/20
 */
@Component
@Slf4j
public class HelloFeignHystrix implements FallbackFactory<HelloFeign> {

    @Override
    public HelloFeign create(Throwable throwable) {
        return new HelloFeign() {
            @Override
            public void sayHello(String name) {
                log.warn("enter hystrix method : sayHello");
            }
        };
    }
}
