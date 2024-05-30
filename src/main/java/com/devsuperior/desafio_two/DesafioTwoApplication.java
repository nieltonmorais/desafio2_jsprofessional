package com.devsuperior.desafio_two;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioTwoApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(DesafioTwoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running");
	}
}
