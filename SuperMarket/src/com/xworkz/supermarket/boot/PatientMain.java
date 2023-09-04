package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.PatientRepository;
import com.xworkz.supermarket.app.repositoryImpl.PatientRepositoryImpl;

public class PatientMain {

	public static void main(String[] args) {
		PatientRepository patientRepository=new PatientRepositoryImpl();
		
		patientRepository.store("JJ");
		patientRepository.store("GG");
		patientRepository.store("SS");
		patientRepository.store("OO");
		patientRepository.store("KK");
		patientRepository.store("RR");
		patientRepository.store("AA");
		patientRepository.store("NN");
		patientRepository.store("MM");
		patientRepository.store("II");
		patientRepository.store("JJ");

	}

}
