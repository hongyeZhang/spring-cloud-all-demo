package com.zhq.feign.service.demo.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : ZHQ
 * @date : 2020/3/20
 */
@RestController
@RequestMapping(value = "/feign/service")
@Slf4j
public class HelloController {

    @RequestMapping(value = "/hello")
    public void sayHello(@RequestHeader("name") String name) {
        log.info("received hello : " + name);
    }
}
