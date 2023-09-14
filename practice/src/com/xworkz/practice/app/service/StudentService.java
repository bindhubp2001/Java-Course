package com.xworkz.practice.app.service;

import com.xworkz.practice.app.dto.StudentDTO;

public interface StudentService {

	boolean validateAndSave(StudentDTO dto);

	StudentDTO findByName(String name);

	StudentDTO findByUSN(String usn);

	StudentDTO findByClgName(String clgName);

	StudentDTO findById(int id);

	StudentDTO findByBranch(String branch);

}
