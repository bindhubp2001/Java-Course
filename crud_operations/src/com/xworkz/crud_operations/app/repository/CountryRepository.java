package com.xworkz.crud_operations.app.repository;

public interface CountryRepository {
	int TOTAL=5;
	void save(String countryName);
	
	default boolean isExsit(String countryName) {
		return false;
	}
}
