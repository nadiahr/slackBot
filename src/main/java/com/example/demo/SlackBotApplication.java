package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication(scanBasePackages = {"me.ramswaroop.jbot", "com.example.slackbot"})
public class SlackBotApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
System.out.println("goooooooooo");
		SpringApplication.run(SlackBotApplication.class, args);
		
	}
}
