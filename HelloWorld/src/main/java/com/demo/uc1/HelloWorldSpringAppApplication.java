package com.demo.uc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSpringAppApplication.class, args);
	}

	@RestController
	public class Demo{
	@RequestMapping("/hello")
	public String sayHello(){
		return "Hello World";
	}
	}
}
