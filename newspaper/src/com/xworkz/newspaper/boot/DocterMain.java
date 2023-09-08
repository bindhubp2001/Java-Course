package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.DocterDTO;
import com.xworkz.newspaper.app.repository.DocterRepository;
import com.xworkz.newspaper.app.repository.DocterRepositoryImpl;
import com.xworkz.newspaper.app.service.DocterService;
import com.xworkz.newspaper.app.service.DocterServiceImpl;

public class DocterMain {

	public static void main(String[] args) {

		DocterRepository docterRepository = new DocterRepositoryImpl();
		DocterService docterService = new DocterServiceImpl(docterRepository);
		DocterDTO docterDTO = new DocterDTO("RAGHU", 27);

		docterService.validateAndSave(docterDTO);

	}

}
