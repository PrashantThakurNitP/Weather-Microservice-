package com.sapient.weatherapp.service;

import com.sapient.weatherapp.domain.WeatherRequest;
import com.sapient.weatherapp.domain.WeatherResponse;
import org.springframework.stereotype.Service;


@Service
public interface WeatherService {
    WeatherResponse getWeatherForCity(WeatherRequest weatherRequest);
}
