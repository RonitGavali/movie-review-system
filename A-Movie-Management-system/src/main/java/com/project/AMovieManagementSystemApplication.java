package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class AMovieManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AMovieManagementSystemApplication.class, args);
		log.info("A MOVIE MANAGEMENT SYSTEM APPLICATION IS STARTED..........");
	}

}
