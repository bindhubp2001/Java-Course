package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.HistoricalPlace;
import com.xworkz.supermarket.app.repositoryImpl.HisoricalPlaceImpl;
import com.xworkz.supermarket.app.service.HistoricalPlaceService;
import com.xworkz.supermarket.app.serviceImpl.HistrocalPlaceServiceImpl;

public class HistoricalPlaceServiceRunner {

	public static void main(String[] args) {
		HistoricalPlace historicalPlace=new HisoricalPlaceImpl();
		
		HistoricalPlaceService historicalPlaceService=new HistrocalPlaceServiceImpl(historicalPlace);
		
		historicalPlaceService.validateAndSave("Hampi");
		historicalPlaceService.validateAndSave(null);
		historicalPlaceService.validateAndSave("");


	}

}
