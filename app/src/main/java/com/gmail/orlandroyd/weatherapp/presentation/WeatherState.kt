package com.gmail.orlandroyd.weatherapp.presentation

import com.gmail.orlandroyd.weatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null,
)
