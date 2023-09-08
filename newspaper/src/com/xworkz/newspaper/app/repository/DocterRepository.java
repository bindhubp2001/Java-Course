package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.DocterDTO;

public interface DocterRepository {
	int TOTAL = 10;

	void persist(DocterDTO docterDTO);
}
