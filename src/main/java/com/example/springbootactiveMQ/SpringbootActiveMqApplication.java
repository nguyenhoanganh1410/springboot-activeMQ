package com.example.springbootactiveMQ;



import com.example.springbootactiveMQ.service.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringbootActiveMqApplication {

	public static void main(String[] args) throws JsonProcessingException {
		ConfigurableApplicationContext appContext = SpringApplication.run(SpringbootActiveMqApplication.class, args);
		ProducerService producerService = appContext.getBean(ProducerService.class);
		producerService.sendToQueue();
		producerService.sendToTopic();
	}

}