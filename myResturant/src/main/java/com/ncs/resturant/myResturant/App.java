package com.ncs.resturant.myResturant;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		SpringApplication app = new SpringApplication(App.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
		app.run(args);
	}
}
