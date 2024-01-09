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
@CrossOrigin(origins = "http://localhost:3000")
public class WeatherControllerImpl implements WeatherController {

    @Autowired
    private WeatherService weatherService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/weather", produces = "application/json")
    public ResponseEntity<WeatherResponse> getWeatherForecast(@RequestParam String cityName) {
        WeatherRequest weatherRequest = new WeatherRequest();
        weatherRequest.setCity(cityName);
        return new ResponseEntity<>(weatherService.getWeatherForCity(weatherRequest), HttpStatus.OK);
    }
}
