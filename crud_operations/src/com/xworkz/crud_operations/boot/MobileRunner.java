package com.xworkz.crud_operations.boot;

import com.xworkz.crud_operations.app.repository.MobileRepository;
import com.xworkz.crud_operations.app.repository.MobileRepositoryImpl;
import com.xworkz.crud_operations.app.service.MobileService;
import com.xworkz.crud_operations.app.service.MobileServiceImpl;

public class MobileRunner {

	public static void main(String[] args) {
		MobileRepository mobileRepository = new MobileRepositoryImpl();

		MobileService mobileService = new MobileServiceImpl(mobileRepository);

		mobileService.validateAndSave(8765436786l);
		mobileService.validateAndSave(8976445666l);
		mobileService.validateAndSave(8976445666l);
		mobileService.validateAndSave(0);

	}

}
