package com.zhq.feign.client.demo.controller;


import com.zhq.all.api.feign.HelloFeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ZHQ
 * @date : 2020/3/20
 */
@RestController
public class HelloController {

    @Autowired
    HelloFeign helloFeign;

    @RequestMapping(value = "/hello")
    public String hello() {
        helloFeign.sayHello("zhq");

        return "success";
    }
}
