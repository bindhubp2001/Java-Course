package com.xworkz.supermarket.app.serviceImpl;

import com.xworkz.supermarket.app.repository.HistoricalPlace;
import com.xworkz.supermarket.app.service.HistoricalPlaceService;

public class HistrocalPlaceServiceImpl implements HistoricalPlaceService {
	
	private HistoricalPlace place;
	
	public HistrocalPlaceServiceImpl(HistoricalPlace place) {
		this.place=place;
	}

	@Override
	public void validateAndSave(String place) {
		if (place != null && !place.isEmpty() && place.length() > 2 && place.length() < 20) {
			System.out.println("DATA IS VALID");
			this.place.save(place);
		} else {
			System.err.println("INVALID DATA");
		}

	}

}
