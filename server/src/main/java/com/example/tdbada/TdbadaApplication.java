package com.example.tdbada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TdbadaApplication {
///// TODO   http://localhost:8080/swagger-ui.html#/     SWAGGER

	public static void main(String[] args) {
		SpringApplication.run(TdbadaApplication.class, args);
	}




}
