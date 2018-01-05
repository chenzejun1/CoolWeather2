package com.example.coolweather.gson;

/**
 * Created by 13760478768 on 2018/1/5.
 */

public class Weather {
    public Basic basic;
    public String status;
    public Forecast now;
    public Forecast[] forecastList;
    public AQI aqi;
    public Suggestion suggestion;
}
