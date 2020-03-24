package ai.yunxi.microservice.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import ai.yunxi.microservice.stream.channel.OrderChannel;

/**
 * @author ZHQ
 **/
@SpringBootApplication
@EnableBinding({OrderChannel.class})
public class StreamKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamKafkaApplication.class, args);
    }
}
