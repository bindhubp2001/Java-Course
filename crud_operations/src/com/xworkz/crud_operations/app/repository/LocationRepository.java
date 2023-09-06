package com.xworkz.crud_operations.app.repository;

public interface LocationRepository {
	int TOTAL=5;
	
	void save(String locationName);
	
	default boolean isExist(String locationName) {
		return false;
	}
}
