package com.xworkz.crud_operations.app.service;

import com.xworkz.crud_operations.app.repository.LocationRepository;
import com.xworkz.crud_operations.app.repository.LocationRepositoryImpl;

public class LocationServiceImpl implements LocationService {

	LocationRepository locationRepository = new LocationRepositoryImpl();

	public LocationServiceImpl(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

	@Override
	public boolean validateAndSave(String locationName) {

		if (locationName != null && !locationName.isEmpty() && locationName.length() >= 3
				&& locationName.length() <= 20) {
			System.out.println("VALID");
			if (!this.locationRepository.isExist(locationName)) {
				System.out.println("invoking throug repo");
				this.locationRepository.save(locationName);
				return true;
			}

			else {
				System.err.println("Please select other");
			}

		} else {
			System.err.println("INvalid Data");

		}

		return false;
	}

}
