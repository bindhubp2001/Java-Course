package com.xworkz.crud_operations.app.repository;

public interface MobileRepository {
	int TOTAL=5;
	void save(long number);
	
	default boolean isExist(long number) {
		return false;
	}
}
