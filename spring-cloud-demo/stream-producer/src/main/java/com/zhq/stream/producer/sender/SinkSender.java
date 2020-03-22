package com.zhq.stream.producer.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;

import java.util.Date;

/**
 * @Author: ZHQ
 * @description:
 * @Date: 2020/1/14 16:48
 */
@EnableBinding(value = {SinkSender.SinkOutput.class})
public class SinkSender {
    private static Logger logger = LoggerFactory.getLogger(SinkSender.class);


    @Bean
    @InboundChannelAdapter(value = SinkOutput.OUTPUT, poller = @Poller(fixedDelay = "2000"))
    public MessageSource<Date> timerMessageSource() {
//        MessageSource<Date> message = new GenericMessage<Date>(new Date());

        return new MessageSource<Date>() {
            @Override
            public Message<Date> receive() {
                return null;
            }
        };
    }


    public interface SinkOutput{
        String OUTPUT = "input";

        @Output(SinkOutput.OUTPUT)
        MessageChannel output();
    }

}
