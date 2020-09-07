package com.edu.currencyservice;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfig {

    @Bean
    public NewTopic infoTopic() {
        return new NewTopic("test.topic", 3, (short) 1);
    }
}
