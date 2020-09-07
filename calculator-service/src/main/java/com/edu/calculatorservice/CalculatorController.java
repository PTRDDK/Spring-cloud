package com.edu.calculatorservice;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class CalculatorController {

    @KafkaListener(topics = "test.topic")
    public void handler(String message, ConsumerRecord<String, String> record) {
        log.info("Na serwisie currency-service był request o walutę {}", message);
    }
}
