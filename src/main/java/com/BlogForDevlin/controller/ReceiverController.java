package com.BlogForDevlin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Jinyl
 * @date 2020/1/2
 * @Mail Jinyl@mail.taiji.com.cn
 * @Describe:
 */
@Component
public class ReceiverController {

    private Logger logger = LoggerFactory.getLogger(ReceiverController.class);

    @RabbitHandler
    @RabbitListener(queues = "immediate_queue_test1")
    public void immediateProcess(String message) {
        logger.info("Receiver" + message);
    }
}
