package com.zhq.all.api.feign;


import com.zhq.all.api.feign.hystrix.HelloFeignHystrix;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : ZHQ
 * @date : 2020/3/20
 */
@FeignClient(value = "feign-service-demo",
                fallbackFactory = HelloFeignHystrix.class)
@RequestMapping(value = "/feign/service")
public interface HelloFeign {

    @RequestMapping(value = "/hello")
    void sayHello(@RequestHeader("name") String name);
}
