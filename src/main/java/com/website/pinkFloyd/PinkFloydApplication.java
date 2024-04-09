package com.website.pinkFloyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.website.pinkFloyd")
public class PinkFloydApplication {
	public static void main(String[] args) {
		SpringApplication.run(PinkFloydApplication.class, args);
	}

}
