package com.edu.currencyservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    private KafkaTemplate<String, Currency> kafkaTemplate;

    @Autowired
    public CurrencyService(KafkaTemplate<String, Currency> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(Currency currency) {
        kafkaTemplate.send("test.topic", currency);
    }
}
