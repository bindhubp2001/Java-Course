package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.WeatherDTO;
import com.xworkz.newspaper.app.repository.WeatherRepository;
import com.xworkz.newspaper.app.repository.WeatherRepositoryImpl;
import com.xworkz.newspaper.app.service.WeatherService;
import com.xworkz.newspaper.app.service.WeatherServiceImpl;

public class WeatherRunner {

	public static void main(String[] args) {

		WeatherRepository repository = new WeatherRepositoryImpl();
		WeatherService service = new WeatherServiceImpl(repository);
		WeatherDTO dto = new WeatherDTO("Banglore", 90, 50);

		service.validateAndSave(dto);
		service.validateAndSave(null);

	}

}
