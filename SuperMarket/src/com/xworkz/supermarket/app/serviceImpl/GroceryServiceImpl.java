package com.xworkz.supermarket.app.serviceImpl;

import com.xworkz.supermarket.app.repository.GroceryRepository;
import com.xworkz.supermarket.app.service.GrocryService;

public class GroceryServiceImpl implements GrocryService{
		private GroceryRepository groceryRepository;
		
		public GroceryServiceImpl(GroceryRepository groceryRepository) {
			this.groceryRepository=groceryRepository;
		}

		@Override
		public boolean validateAndSave(String grocery) {
			if (grocery != null && !grocery.isEmpty() && grocery.length() > 3 && grocery.length() < 20) {
				System.out.println("Data is valid");
				this.groceryRepository.save(grocery);
			} else {
				System.err.println("Data is not valid");
			}
			return false;
			
		}
		
	
}
