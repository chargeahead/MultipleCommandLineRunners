package com.example.commandliners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
@Order(2)
public class CommandlinersApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CommandlinersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running commandline runner from main class");
	}
}
