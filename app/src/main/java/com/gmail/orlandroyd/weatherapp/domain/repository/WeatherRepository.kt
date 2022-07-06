package com.gmail.orlandroyd.weatherapp.domain.repository

import com.gmail.orlandroyd.weatherapp.domain.util.Resource
import com.gmail.orlandroyd.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}