package com.sapient.weatherapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WeatherAppApplication {


	public static void main(String[] args) {
		System.out.println("hello");

		SpringApplication.run(WeatherAppApplication.class, args);
	}

}
