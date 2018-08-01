package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"me.ramswaroop.jbot", "com.example.demo"})
public class SlackBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlackBotApplication.class, args);
	}
}
