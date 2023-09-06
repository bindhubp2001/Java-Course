package com.xworkz.supermarket.app.serviceImpl;

import com.xworkz.supermarket.app.repository.JuiceRepository;
import com.xworkz.supermarket.app.service.JuiceService;

public class JuiceServiceImpl implements JuiceService {

	private JuiceRepository juiceRepository;

	public JuiceServiceImpl(JuiceRepository juiceRepository) {
		this.juiceRepository = juiceRepository;
	}

	@Override
	public boolean validateAndSave(String juice) {
		if (juice != null && !juice.isEmpty() && juice.length() >= 3 && juice.length() <= 20) {
			System.out.println("Juice is VAlid");
			//Business Validation
			if (!this.juiceRepository.isExist(juice)) {
				System.out.println("invoking throug repo");
				this.juiceRepository.persirt(juice);
				return true;
			} else {
				System.err.println("Please select other");
			}

		} else {
			System.err.println("INvalid Data");

		}
		return false;
	}

}
