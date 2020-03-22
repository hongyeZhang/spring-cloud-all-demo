package com.zhq.rabbitmqhello.controller;

import com.netflix.discovery.converters.Auto;
import com.zhq.rabbitmqhello.entity.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-07-04 13:42
 **/
@RestController
public class HelloController {

    @Autowired
    Sender sender;

    @RequestMapping(value = "/rabbitmq/hello")
    public String hello() {
        sender.send();
        return "success";
    }

}
