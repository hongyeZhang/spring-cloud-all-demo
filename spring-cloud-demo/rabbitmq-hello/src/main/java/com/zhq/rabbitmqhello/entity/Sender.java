package com.zhq.rabbitmqhello.entity;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-07-04 13:03
 **/
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello" + new Date();
        System.out.println("sender : " + context);
        amqpTemplate.convertAndSend("hello", context);
    }

}
