package com.xworkz.crud_operations.app.service;

import com.xworkz.crud_operations.app.repository.CountryRepository;

public class CountryServiceImpl implements CountryService {

	private CountryRepository countryRepository;

	public CountryServiceImpl(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;

	}

	@Override
	public boolean validateAndSave(String countryName) {

		if (countryName != null && !countryName.isEmpty() && countryName.length()>=2 && countryName.length() <= 20) {
			System.out.println("VALID");
			if (!this.countryRepository.isExsit(countryName)) {
				System.out.println("INvoking through repo");
				this.countryRepository.save(countryName);
				return true;
			}else {
				System.err.println("Please Select Other Name");
			}
		}
		else {
			System.err.println("INVALID DATA");
		}
		return false;
	}

}
