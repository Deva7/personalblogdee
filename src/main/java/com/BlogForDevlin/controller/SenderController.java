package com.BlogForDevlin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Jinyl
 * @date 2020/1/2
 * @Mail Jinyl@mail.taiji.com.cn
 * @Describe:
 */
@Component
public class SenderController {

    private Logger logger = LoggerFactory.getLogger(SenderController.class);

    @Autowired
    RabbitTemplate rabbitTemplate;


    public void send() {
        String message =  "message" + new Date();
        logger.info("Sender  " + message);
        rabbitTemplate.convertAndSend("immediate_exchange_test1", "immediate_routing_key_test1", message);
    }
}
