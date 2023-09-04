package com.api.bookstockmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// refazer códigos e refatorar packages
@SpringBootApplication
@RestController
public class BookstockManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstockManagerApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Olá Mundo!";
	}
}
