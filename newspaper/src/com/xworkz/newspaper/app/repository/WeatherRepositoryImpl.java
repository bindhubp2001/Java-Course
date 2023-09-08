package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.WeatherDTO;

public class WeatherRepositoryImpl implements WeatherRepository {

	private WeatherDTO[] dtos = new WeatherDTO[TOTAL_LOCATION];
	private int position;

	@Override
	public void persist(WeatherDTO dto) {

		if (position < TOTAL_LOCATION) {
			this.dtos[position] = dto;
			System.out.println(dto + " Store at position : " + this.position);
			this.position++;
		}

	}

}
