package com.xworkz.crud.boot;

import com.xworkz.crud.app.dto.DeveloperDTO;
import com.xworkz.crud.app.repository.DeveloperRepository;
import com.xworkz.crud.app.repository.DeveloperRepositoryImpl;
import com.xworkz.crud.app.service.DeveloperService;
import com.xworkz.crud.app.service.DeveloperServiceImpl;

public class DeveloperMain {

	public static void main(String[] args) {

		DeveloperDTO developerDTO = new DeveloperDTO("Ram", 2, 42000, "Saskin", "teamLead", false);

		DeveloperDTO developerDTO2 = new DeveloperDTO("Ram", 4, 50000, "L&T", "HUMAN RESOURCE", false);

		DeveloperRepository developerRepository = new DeveloperRepositoryImpl();

		DeveloperService developerService = new DeveloperServiceImpl(developerRepository);

		developerService.validateAndSave(developerDTO);
		System.out.println();
		developerService.validateAndSave(developerDTO2);

		 DeveloperDTO present=developerService.findByName("Ram");
		 System.out.println("FOUND"+present);

	}

}
