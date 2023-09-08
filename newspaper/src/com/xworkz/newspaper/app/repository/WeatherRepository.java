package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.WeatherDTO;

public interface WeatherRepository {
	int TOTAL_LOCATION=5;
	
	void persist(WeatherDTO dto);
	
}
