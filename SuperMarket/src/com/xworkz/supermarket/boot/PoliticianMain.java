package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.PoliticianRepository;
import com.xworkz.supermarket.app.repositoryImpl.PoliticianRepositoryImpl;

public class PoliticianMain {
	public static void main(String[] args) {
		PoliticianRepository politicianRepository=new PoliticianRepositoryImpl();
		
		politicianRepository.save("Karnataka");
		politicianRepository.save("GOA");
		politicianRepository.save("Kerala");
		politicianRepository.save("Maharastra");
		politicianRepository.save("TamilNadu");
		politicianRepository.save("AndraPradesh");
		politicianRepository.save("Telangana");
		politicianRepository.save("Rajastan");
		politicianRepository.save("Delhi");
		politicianRepository.save("West BEngal");
		politicianRepository.save("Arunachal Pradesh");
	}
}
