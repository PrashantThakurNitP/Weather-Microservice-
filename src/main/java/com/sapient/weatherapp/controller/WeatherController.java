package com.sapient.weatherapp.controller;

import com.sapient.weatherapp.domain.WeatherRequest;
import com.sapient.weatherapp.domain.WeatherResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface WeatherController {
    ResponseEntity<WeatherResponse> getWeatherForecast(String cityName);
}
