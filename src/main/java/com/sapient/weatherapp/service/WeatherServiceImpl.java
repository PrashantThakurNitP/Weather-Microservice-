package com.sapient.weatherapp.service;

import com.sapient.weatherapp.domain.DailyWeather;
import com.sapient.weatherapp.domain.WeatherRequest;
import com.sapient.weatherapp.domain.WeatherResponse;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Override
    public WeatherResponse getWeatherForCity(WeatherRequest weatherRequest) {
       // return null;
        DailyWeather dailyWeather1 = DailyWeather.builder().minTemperature(15.5).maxTemperature(30.5).day("Wednesday").build();
        DailyWeather dailyWeather2 = DailyWeather.builder().minTemperature(15.5).maxTemperature(30.5).day("Wednesday").build();
        DailyWeather dailyWeather3 = DailyWeather.builder().minTemperature(15.5).maxTemperature(30.5).day("Wednesday").build();
        DailyWeather[] dailyWeathers = new DailyWeather[]{dailyWeather1, dailyWeather2, dailyWeather3};
        return WeatherResponse.builder().message("Carry Umbrella").dailyWeathers(dailyWeathers).build();
    }
}
