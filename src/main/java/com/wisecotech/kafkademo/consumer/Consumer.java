package com.wisecotech.kafkademo.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Author: Xiaour
 * @Description:
 * @Date: 2018/5/22 15:03
 */
@Component
public class Consumer {

//    @KafkaListener(topics = {"wisecotech-test"})
//    public void listen(ConsumerRecord<?, ?> record){
//
//        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
//
//        if (kafkaMessage.isPresent()) {
//            Object message = kafkaMessage.get();
//            System.out.println("---->"+record);
//            System.out.println("---->"+message);
//
//        }
//    }

//    @KafkaListener(topics = {"testlog"})
//    public void listen2(ConsumerRecord<?, ?> record){
//        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
//        if (kafkaMessage.isPresent()) {
//            Object message = kafkaMessage.get();
//            System.out.println("开始消费");
//            System.out.println("---->"+record);
//            System.out.println("---->"+message);
//
//        }
//    }
}
