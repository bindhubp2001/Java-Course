package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.PoliticianRepository;
import com.xworkz.supermarket.app.repositoryImpl.PoliticianRepositoryImpl;
import com.xworkz.supermarket.app.service.PoliticianService;
import com.xworkz.supermarket.app.serviceImpl.PoliticianServiceImpl;

public class PoliticianServiceRunner {

	public static void main(String[] args) {
		PoliticianRepository politicianRepository=new PoliticianRepositoryImpl();
		
		PoliticianService politicianService=new PoliticianServiceImpl(politicianRepository);
		
		politicianService.validateAndSave(null);
		politicianService.validateAndSave("YADIYURAPPA");
		politicianService.validateAndSave("");

	}

}
