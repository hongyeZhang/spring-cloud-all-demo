package com.zhq.ribbon.service.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : ZHQ
 * @date : 2020/3/22
 */
@RestController
@Slf4j
public class HelloController {

    @RequestMapping(value = "/ribbon/service/hello")
    public String ribbonHello(String name) {
        log.info("received request : name = " + name);
        return name;
    }
}
