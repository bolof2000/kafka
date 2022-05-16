package com.streams.streams.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaTopicConfig {

    @Bean
    public NewTopic firstTopic(){
        return TopicBuilder.name("boloftopic").build();
    }
}
