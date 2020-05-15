package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.kafka.producer.Producer;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
	
	private Producer producer;

	@Autowired
	public KafkaController(Producer producer) {
		this.producer = producer;

	}

	@PostMapping(value = "/publishMessage")
	public void sendMessageToKafkaTopic(@RequestParam("publisherMessage") String publisherMessage) {

		this.producer.sendMessage(publisherMessage);
	}
}
