package com.xworkz.practice.app.service;

import com.xworkz.practice.app.dto.EngineerDTO;

public interface EngineerService {

	boolean validateAndSave(EngineerDTO dto);
	
	EngineerDTO findByName(String name);
	EngineerDTO findByClgName(String clgname);

}
