package com.xworkz.practice.app.repository;

import com.xworkz.practice.app.dto.StudentDTO;

public interface StudentRepository {

	int TOTAL_STUDENT = 10;

	void save(StudentDTO dto);

	boolean isExist(StudentDTO dto);

	StudentDTO findByName(String name);

	StudentDTO findByUSN(String usn);

	StudentDTO findByClgName(String clgName);
	
	StudentDTO findById(int id);
	
	StudentDTO findByBranch(String branch);

}
