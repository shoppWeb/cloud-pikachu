package com.cloud.pikachu;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MyReceiver {

    @RabbitListener(queues="myQueue")
    public void process(String message){
        System.err.println(message);
    }
}
