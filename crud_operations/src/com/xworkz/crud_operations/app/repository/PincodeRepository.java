package com.xworkz.crud_operations.app.repository;

public interface PincodeRepository {
	int TOTAL_CODES = 5;

	void save(int pincode);

	default boolean isExist(int picode) {
		return false;
	}
}
