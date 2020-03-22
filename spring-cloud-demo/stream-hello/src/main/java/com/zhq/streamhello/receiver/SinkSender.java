package com.zhq.streamhello.receiver;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;

/**
 * @Author: ZHQ
 * @description:
 * @Date: 2020/1/14 15:42
 */
public interface SinkSender {

    @Output(Sink.INPUT)
    MessageChannel output();
}
