package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.PilotRepository;
import com.xworkz.supermarket.app.repositoryImpl.PilotRepositoryImpl;
import com.xworkz.supermarket.app.service.PilotService;
import com.xworkz.supermarket.app.serviceImpl.PilotServiceImpl;

public class PilotServiceRunner {

	public static void main(String[] args) {
		PilotRepository pilotRepository=new PilotRepositoryImpl();
		
		PilotService pilotService=new PilotServiceImpl(pilotRepository);
		
		pilotService.validateAndSave(null);
		pilotService.validateAndSave("");
		pilotService.validateAndSave("Quatar AirWays");

	}

}
