package com.sapient.weatherapp.controller;

import com.sapient.weatherapp.domain.WeatherRequest;
import com.sapient.weatherapp.domain.WeatherResponse;
import com.sapient.weatherapp.service.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@Slf4j
public class WeatherControllerImpl implements WeatherController{

    @Autowired
    private WeatherService weatherService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/weather",produces = "application/json")
    @Override

    public ResponseEntity<WeatherResponse> getWeatherForecast(@RequestBody  WeatherRequest weatherRequest) {
        return new ResponseEntity<>(weatherService.getWeatherForCity(weatherRequest), HttpStatus.OK) ;
    }
}
