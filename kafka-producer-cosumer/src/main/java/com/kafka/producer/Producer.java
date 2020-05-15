package com.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Producer {
private static final String TOPIC = "order";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String producerMessage) {

		System.out.println(String.format("Prodcuer produces message as....." + producerMessage, producerMessage));
		kafkaTemplate.send(TOPIC, producerMessage);

	}

}
