package com.xworkz.practice.app.repository;

import com.xworkz.practice.app.dto.EngineerDTO;

public interface EngineerRepository {

	int TOTAL = 10;

	void persist(EngineerDTO dto);

	boolean isExist(EngineerDTO dto);

	EngineerDTO findByName(String name);

	EngineerDTO findByClgName(String clgname);
	


}
