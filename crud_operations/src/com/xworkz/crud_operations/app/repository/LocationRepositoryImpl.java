package com.xworkz.crud_operations.app.repository;

public class LocationRepositoryImpl implements LocationRepository {

	private String[] locations = new String[TOTAL];

	private int index;

	@Override
	public void save(String locationName) {
		if (index < TOTAL) {
			this.locations[index] = locationName;
			System.out.println("Store " + locationName + " at position " + this.index);
			this.index++;
		} else {
			System.out.println("DS id Full,,, Cannot Store...");
		}
	}

	@Override
	public boolean isExist(String locationName) {

		for (int i = 0; i < index; i++) {
			String temp = locations[i];

			if (temp != null && temp.equals(locationName)) {
				System.out.println("Location Name Already Exist....");
				return true;
			}

		}

		return LocationRepository.super.isExist(locationName);
	}

}
