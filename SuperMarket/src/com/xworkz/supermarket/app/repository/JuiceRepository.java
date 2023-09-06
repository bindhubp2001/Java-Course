package com.xworkz.supermarket.app.repository;

public interface JuiceRepository {
	int TOTAL = 5;

	void persirt(String juice);

	default boolean isExist(String juice) {
		return false;
	}
}
