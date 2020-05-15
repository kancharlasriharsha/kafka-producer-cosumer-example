package com.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;

public class Consumer {
	
	@KafkaListener(topics = "order", groupId = "id")
	public void consume(String message) {
		System.out.println(String.format("Consumed message from producer..."+message, message));
	}
}
