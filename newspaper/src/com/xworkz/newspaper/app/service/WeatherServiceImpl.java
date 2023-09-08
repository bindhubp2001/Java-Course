package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.WeatherDTO;
import com.xworkz.newspaper.app.repository.WeatherRepository;

public class WeatherServiceImpl implements WeatherService {

	private WeatherRepository repository;

	public WeatherServiceImpl(WeatherRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(WeatherDTO dto) {

		if (dto != null) {
			System.out.println("DTO is not null,,");
			String location = dto.getLocation();
			double humidity = dto.getHumidity();
			int degreeCelcius = dto.getDegreeCelius();

			if (location != null && !location.isEmpty() && location.length() >= 3 && location.length() <= 30) {
				System.out.println("Location is VALID");
			} else {
				System.err.println("Location is INVALID");
				return false;
			}

			if (humidity != 0) {
				System.out.println("HUmidity is VALID");
			} else {
				System.err.println("HUmidity is INVALID");
				return false;
			}

			if (degreeCelcius != 0) {
				System.out.println("DEGREE CELCIUS is VALID");
			} else {
				System.err.println("DEGREE CELCIUS is INVALID");
				return false;
			}

			this.repository.persist(dto);
			return true;
		}
		
		else {
			System.err.println("DTO is NUll");
		}

		return false;
	}

}
