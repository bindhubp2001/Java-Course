package com.xworkz.crud_operations.boot;

import com.xworkz.crud_operations.app.repository.LocationRepository;
import com.xworkz.crud_operations.app.repository.LocationRepositoryImpl;
import com.xworkz.crud_operations.app.service.LocationService;
import com.xworkz.crud_operations.app.service.LocationServiceImpl;

public class LocationRunner {

	public static void main(String[] args) {
		LocationRepository locationRepository=new LocationRepositoryImpl();
		
		LocationService locationService=new LocationServiceImpl(locationRepository);
		
		locationService.validateAndSave("Mysore");
		System.out.println();
		locationService.validateAndSave("Mysore");
	}

}
