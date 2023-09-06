package com.xworkz.crud_operations.boot;

import com.xworkz.crud_operations.app.repository.PincodeRepository;
import com.xworkz.crud_operations.app.repository.PincodeRepositoryImpl;
import com.xworkz.crud_operations.app.service.PincodeService;
import com.xworkz.crud_operations.app.service.PincodeServiceImpl;

public class PincodeRunner {

	public static void main(String[] args) {
		PincodeRepository pincodeRepository = new PincodeRepositoryImpl();
		PincodeService pincodeService = new PincodeServiceImpl(pincodeRepository);

		pincodeService.validateAndSave(233435);
		System.out.println();
		pincodeService.validateAndSave(233435);
		System.out.println();
		pincodeService.validateAndSave(0);

	}

}
