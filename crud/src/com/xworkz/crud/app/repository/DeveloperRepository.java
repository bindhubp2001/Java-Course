package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.DeveloperDTO;

public interface DeveloperRepository {

	int TOTAL = 10;

	void persist(DeveloperDTO dto);

	default DeveloperDTO findByName(String name) {
		return null;
	}

}
