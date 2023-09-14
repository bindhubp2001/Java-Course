package com.xworkz.crud.app.service;

import com.xworkz.crud.app.dto.DeveloperDTO;

public interface DeveloperService {

	boolean validateAndSave(DeveloperDTO dto);

	default DeveloperDTO findByName(String name) {
		return null;
	}

//	DeveloperDTO findByWorkingFor(String c_name);
//
//	DeveloperDTO findByNameAndWorkingFor(String name, String c_name);

}
