package com.zhq.rabbitmqhello.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-07-04 13:07
 **/
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
