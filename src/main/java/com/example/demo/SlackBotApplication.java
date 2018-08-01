package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@ComponentScan(basePackages = { "com.example.slackbot" })
@SpringBootApplication(scanBasePackages = { "me.ramswaroop.jbot", "com.example" })
@EnableConfigurationProperties
public class SlackBotApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SlackBotApplication.class, args);

	}

	@Bean
	public RestTemplate getRestTemplate() {
	    return new RestTemplate();
	}
}
