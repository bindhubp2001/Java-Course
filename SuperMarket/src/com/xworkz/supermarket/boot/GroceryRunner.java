package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.GroceryRepository;
import com.xworkz.supermarket.app.repositoryImpl.GroceryRepositoryImpl;

public class GroceryRunner {

	public static void main(String[] args) {
		GroceryRepository groceryRepository=new GroceryRepositoryImpl();
		groceryRepository.save("Dark FAntacy");
		groceryRepository.save("Unibic");
		groceryRepository.save("MarieGold");
		groceryRepository.save("Oreo");
		groceryRepository.save("Milk Shake");
		groceryRepository.save("Juice");
		groceryRepository.save("Chocolate");
		groceryRepository.save("Ice Cream");
		groceryRepository.save("Fish");
		groceryRepository.save("Cashew");
		groceryRepository.save("Veggie");
		

	}

}
