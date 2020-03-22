package com.zhq.hystrix.demo.fallback;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.exception.HystrixBadRequestException;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

/**
 * Hystrix Fallback 降级
 *
 * @author ZHQ
 */
public class HystrixCommand4Fallback extends HystrixCommand<String> {

    private final String name;

    public HystrixCommand4Fallback(String name) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("FallbackGroup"))
                        .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
                                        .withExecutionTimeoutInMilliseconds(1000)));
        this.name = name;
    }

    @Override
    protected String getFallback() {
        System.out.println(Thread.currentThread() + " Hi This is Fallback for name:" + this.name);
        return this.name;
    }

    @Override
    protected String run() throws Exception {
        //1.无限循环,默认1秒钟超时。
        //        while(true){}
        //2.运行时异常
        //        int i=1/0;
        //        return name;
        //3.throw 异常
        //        throw new Exception("xyz");
        //4.HystrixBadRequestException异常不会触发降级
        throw new HystrixBadRequestException("xtz");
    }

    public static class UnitTest {
        @Test
        public void testHystrixCommand4Fallback() {
            System.out.println("--");
            new HystrixCommand4Fallback("Thread Fallback").queue();
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}