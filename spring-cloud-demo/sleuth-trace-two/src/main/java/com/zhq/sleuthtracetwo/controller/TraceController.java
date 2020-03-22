package com.zhq.sleuthtracetwo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-07-03 16:16
 **/
@RestController
public class TraceController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/trace-2")
    public String trace(HttpServletRequest request) {
        logger.info("=====<call trace-2>, TraceId = {}, SpanId = {}", request.getHeader("X-B3-TraceId"), request.getHeader("X-B3-SpanId"));
        return "trace";
    }


}
