package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.JuiceRepository;
import com.xworkz.supermarket.app.repositoryImpl.JuiceRepositoryImpl;
import com.xworkz.supermarket.app.service.JuiceService;
import com.xworkz.supermarket.app.serviceImpl.JuiceServiceImpl;

public class JuiceRunner {

	public static void main(String[] args) {
		JuiceRepository juiceRepository = new JuiceRepositoryImpl();

		JuiceService juiceService = new JuiceServiceImpl(juiceRepository);

		juiceService.validateAndSave("Fanta");
		System.out.println();
		juiceService.validateAndSave("mountain dew");
		System.out.println();
		juiceService.validateAndSave("mountain dew");
	}

}
