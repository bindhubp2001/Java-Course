package com.xworkz.crud_operations.boot;

import com.xworkz.crud_operations.app.repository.TrainNumberRepository;
import com.xworkz.crud_operations.app.repository.TrainNumberRepositoryImpl;
import com.xworkz.crud_operations.app.service.TrainNumberService;
import com.xworkz.crud_operations.app.service.TrainNumberServiceImpl;

public class TrainNumberRunner {
	
	

	public static void main(String[] args) {
			TrainNumberRepository numberRepository=new TrainNumberRepositoryImpl();
			
			TrainNumberService numberService=new TrainNumberServiceImpl(numberRepository);
			
			numberService.validateAndSave(20937489);
			numberService.validateAndSave(20937489);
			

	}

}
