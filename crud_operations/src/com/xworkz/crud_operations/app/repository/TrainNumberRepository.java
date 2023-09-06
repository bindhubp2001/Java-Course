package com.xworkz.crud_operations.app.repository;

public interface TrainNumberRepository {
	int TOTAL = 5;

	void save(int trainNumber);

	default boolean isExist(int trainNumber) {
		return false;
	}
}
