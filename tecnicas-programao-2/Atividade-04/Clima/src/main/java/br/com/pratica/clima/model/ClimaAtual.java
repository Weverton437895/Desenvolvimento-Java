package br.com.pratica.clima.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClimaAtual {

    private String time;

    @JsonProperty("temperature_2m")
    private double temperature2m;

    @JsonProperty("windspeed_10m")
    private double windspeed10m;

    @JsonProperty("weathercode")
    private int weathercode;

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public double getTemperature2m() { return temperature2m; }
    public void setTemperature2m(double temperature2m) { this.temperature2m = temperature2m; }

    public double getWindspeed10m() { return windspeed10m; }
    public void setWindspeed10m(double windspeed10m) { this.windspeed10m = windspeed10m; }

    public int getWeathercode() { return weathercode; }
    public void setWeathercode(int weathercode) { this.weathercode = weathercode; }
}