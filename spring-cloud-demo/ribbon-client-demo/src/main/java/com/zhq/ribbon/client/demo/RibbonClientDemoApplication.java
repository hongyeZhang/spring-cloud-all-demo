package com.zhq.ribbon.client.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author : ZHQ
 * @date : 2020/3/22
 */
@SpringBootApplication
public class RibbonClientDemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(
                        RibbonClientDemoApplication.class, args);
    }
}
