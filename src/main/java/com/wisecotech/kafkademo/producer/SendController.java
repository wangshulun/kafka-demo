package com.wisecotech.kafkademo.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

/**
 * @Author: Xiaour
 * @Description:
 * @Date: 2018/5/22 15:13
 */
@RestController
@RequestMapping("/kafka")
@Slf4j
public class SendController {

    @Autowired
    private Producer producer;

    @Autowired
    KafkaTemplate kafkaTemplate;

    @RequestMapping(value = "/send")
    public String send() {
        producer.send();
        return "{\"code\":0}";
    }

    @RequestMapping(value = "log")
    public String log() {
        log.info("test-log-kafka " + System.currentTimeMillis());
        return "Success";
    }
}
