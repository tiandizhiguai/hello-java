package org.hello.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"org.hello.service",
		"org.hello.rest"})
public class HelloBootstrap {

	public static void main(String[] args) {
		new SpringApplication(HelloBootstrap.class).run(args);
	}
}