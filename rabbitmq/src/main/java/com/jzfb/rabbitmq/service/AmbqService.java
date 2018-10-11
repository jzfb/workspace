package com.jzfb.rabbitmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class AmbqService {

    @RabbitListener(queues = "jzfb.emps")
    public void receive(String book){
        System.out.println("收到消息："+book);
    }
}
