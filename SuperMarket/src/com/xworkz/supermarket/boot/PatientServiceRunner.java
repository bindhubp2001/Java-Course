package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.PatientRepository;
import com.xworkz.supermarket.app.repositoryImpl.PatientRepositoryImpl;
import com.xworkz.supermarket.app.service.PatientService;
import com.xworkz.supermarket.app.serviceImpl.PatientServiceImpl;

public class PatientServiceRunner {

	public static void main(String[] args) {
	
		PatientRepository patientRepository=new PatientRepositoryImpl();
		
		PatientService patientService=new PatientServiceImpl(patientRepository);
		
		patientService.validateAndSave(null);
		patientService.validateAndSave("");
		patientService.validateAndSave("CG HOSPITAL");
		

	}

}
