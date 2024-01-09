package com.sapient.weatherapp.controller;

import com.sapient.weatherapp.domain.WeatherRequest;
import com.sapient.weatherapp.domain.WeatherResponse;
import org.springframework.http.ResponseEntity;

public interface WeatherController {
    ResponseEntity<WeatherResponse> getWeatherForecast(WeatherRequest weatherRequest);
}
