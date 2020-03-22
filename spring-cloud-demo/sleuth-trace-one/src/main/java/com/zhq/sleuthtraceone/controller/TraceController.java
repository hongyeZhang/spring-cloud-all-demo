package com.zhq.sleuthtraceone.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-07-03 16:09
 **/
@RestController
public class TraceController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/trace-1")
    public String trace() {
        return restTemplate.getForObject("http://trace-two/trace-2", String.class);
    }

    @RequestMapping(value = "/hello")
    public String hello() {
        String str = "";
        System.out.println(StringUtils.isEmpty(str));
        return "success";
    }
}
