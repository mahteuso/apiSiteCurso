package com.mateus.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableWebMvc
public class SiteCursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiteCursosApplication.class, args);
	}

}
