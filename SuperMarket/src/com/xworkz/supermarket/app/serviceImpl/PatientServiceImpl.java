package com.xworkz.supermarket.app.serviceImpl;

import com.xworkz.supermarket.app.repository.PatientRepository;
import com.xworkz.supermarket.app.service.PatientService;

public class PatientServiceImpl implements PatientService{
	
	private PatientRepository patientRepository;
	
	public PatientServiceImpl(PatientRepository patientRepository) {
		this.patientRepository=patientRepository;
	}

	@Override
	public boolean validateAndSave(String hopitalName) {
		if (hopitalName != null && !hopitalName.isEmpty() && hopitalName.length() > 3 && hopitalName.length() < 20) {
			System.out.println("Data is valid");
			this.patientRepository.store(hopitalName);
		} else {
			System.err.println("Data is invalid");
		}
		return false;
	}
	
	

}
