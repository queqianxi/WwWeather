package com.wwweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 *
 * @author Ww
 * @date 2018/4/14
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
