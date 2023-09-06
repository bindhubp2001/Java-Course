package com.xworkz.crud_operations.boot;

import com.xworkz.crud_operations.app.repository.CountryRepository;
import com.xworkz.crud_operations.app.repository.CountryRepositoryImpl;
import com.xworkz.crud_operations.app.service.CountryService;
import com.xworkz.crud_operations.app.service.CountryServiceImpl;

public class CountryRunner {

	public static void main(String[] args) {
		CountryRepository countryRepository = new CountryRepositoryImpl();
		CountryService countryService = new CountryServiceImpl(countryRepository);
		countryService.validateAndSave("INDIA");
		countryService.validateAndSave("INDIA");

	}

}
