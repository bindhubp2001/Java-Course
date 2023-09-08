package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.DocterDTO;

public interface DocterService {
	boolean validateAndSave(DocterDTO docterDTO);
	
}
