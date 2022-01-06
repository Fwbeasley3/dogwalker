package com.example.dogwalker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Controller;

@SpringBootApplication(scanBasePackages = {"boot.registration"} , exclude = JpaRepositoriesAutoConfiguration.class)
@Controller
public class DogwalkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogwalkerApplication.class, args);
	}


}
