package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.AadharDTO;
import com.xworkz.newspaper.app.repository.AadharRepository;
import com.xworkz.newspaper.app.repository.AadharRepositoryImpl;
import com.xworkz.newspaper.app.service.AadharService;
import com.xworkz.newspaper.app.service.AadharServiceImpl;

public class AadharMain {

	public static void main(String[] args) {

		AadharDTO aadharDTO = new AadharDTO(673488347834l, "Karnataka", "kannda");

		AadharRepository aadharRepository = new AadharRepositoryImpl();

		AadharService aadharService = new AadharServiceImpl(aadharRepository);

		aadharService.validateAndSave(aadharDTO);

	}

}
