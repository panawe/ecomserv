package com.bigcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
@ComponentScan("com.bigcart.*")
public class BigCart {
	
	public static void main(String[] args) {
		SpringApplication.run(BigCart.class, args);
    }  

}
