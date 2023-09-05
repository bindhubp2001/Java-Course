package com.xworkz.supermarket.app.serviceImpl;

import com.xworkz.supermarket.app.repository.PoliticianRepository;
import com.xworkz.supermarket.app.service.PoliticianService;

public class PoliticianServiceImpl implements PoliticianService{
	private PoliticianRepository politicianRepository;
	
	public PoliticianServiceImpl(PoliticianRepository politicianRepository) {
		this.politicianRepository=politicianRepository;
	}

	@Override
	public boolean validateAndSave(String stateName) {
		if (stateName != null && !stateName.isEmpty() && stateName.length() > 3 && stateName.length() < 20) {
			System.out.println("Data is valid");
			this.politicianRepository.save(stateName);
		} else {
			System.err.println("Data is invalid");
		}
		return false;
	}

	
}
