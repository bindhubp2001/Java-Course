package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.PilotRepository;
import com.xworkz.supermarket.app.repositoryImpl.PilotRepositoryImpl;

public class PilotMain {

	public static void main(String[] args) {
		
		PilotRepository pilotRepository=new PilotRepositoryImpl();
		
		pilotRepository.save("Quatar AirWays");
		pilotRepository.save("Singapore AirWays");
		pilotRepository.save("Dubai AirWays");
		pilotRepository.save("US AirWays");
		pilotRepository.save("China AirWays");
		pilotRepository.save("India AirWays");
		pilotRepository.save("Pakistan AirWays");
		pilotRepository.save("Nepal AirWays");
		pilotRepository.save("Paries AirWays");
		pilotRepository.save("London AirWays");
		pilotRepository.save("Uk");

	}

}
