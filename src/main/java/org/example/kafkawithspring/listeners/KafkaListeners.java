package org.example.kafkawithspring.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "my-topic",
            groupId = "groupId"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data + " \uD83C\uDF89");
    }

}