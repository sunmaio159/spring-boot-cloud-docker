package com.sun.springboot;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching //开启缓存
public class SpringBootCloudDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudDockerApplication.class, args);
	}
	
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("active.queue");
	}
}
