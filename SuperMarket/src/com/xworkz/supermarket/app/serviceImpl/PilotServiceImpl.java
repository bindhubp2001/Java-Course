package com.xworkz.supermarket.app.serviceImpl;

import com.xworkz.supermarket.app.repository.PilotRepository;
import com.xworkz.supermarket.app.service.PilotService;

public class PilotServiceImpl implements PilotService {
	
	private PilotRepository pilotRepository;
	
	public PilotServiceImpl(PilotRepository pilotRepository) {
		this.pilotRepository=pilotRepository;
	}

	@Override
	public boolean validateAndSave(String name) {
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Data is valid");
			this.pilotRepository.save(name);
		} else {
			System.err.println("Data is invalid");
		}
		return false;
	}
	
	
	

}
