package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class WeatherDTO implements Serializable {

	String location;
	double humidity;
	int degreeCelius;

	public WeatherDTO() {

	}

	public WeatherDTO(String location, double humidity, int degreeCelius) {
		super();
		this.location = location;
		this.humidity = humidity;
		this.degreeCelius = degreeCelius;
	}

	@Override
	public String toString() {
		return "WeatherDTO [location=" + location + ", humidity=" + humidity + ", degreeCelius=" + degreeCelius + "]";
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public int getDegreeCelius() {
		return degreeCelius;
	}

	public void setDegreeCelius(int degreeCelius) {
		this.degreeCelius = degreeCelius;
	}

}
