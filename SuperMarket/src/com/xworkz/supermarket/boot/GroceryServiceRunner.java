package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.GroceryRepository;
import com.xworkz.supermarket.app.repositoryImpl.GroceryRepositoryImpl;
import com.xworkz.supermarket.app.service.GrocryService;
import com.xworkz.supermarket.app.serviceImpl.GroceryServiceImpl;

public class GroceryServiceRunner {

	public static void main(String[] args) {
		GroceryRepository groceryRepository=new GroceryRepositoryImpl();
		
		GrocryService grocryService=new GroceryServiceImpl(groceryRepository);
		grocryService.validateAndSave(null);
		grocryService.validateAndSave("Bread");
		grocryService.validateAndSave("");
	}

}
