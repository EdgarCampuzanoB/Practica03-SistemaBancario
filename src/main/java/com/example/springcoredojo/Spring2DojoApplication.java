package com.example.springcoredojo;


import com.example.springcoredojo.banco.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.awt.*;

@SpringBootApplication
public class Spring2DojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring2DojoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context){
		return args -> {
			Menu menu = context.getBean(Menu.class);
			Customer customer = context.getBean(Customer.class);
			System.out.println(menu);
			System.out.println(customer);

		};
	}

}
