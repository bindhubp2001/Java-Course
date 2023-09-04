package com.xworkz.supermarket.app.repositoryImpl;

import com.xworkz.supermarket.app.repository.PoliticianRepository;

public class PoliticianRepositoryImpl implements PoliticianRepository{

	private String[] states=new String[10];
	int pos;
	@Override
	public void save(String stateName) {
		if(pos< TOTAL_STATES) {
			this.states[pos]=stateName;
			System.out.println("Store state "+stateName+" At position "+pos);
			pos++;
		}
		else {
			System.err.println("Ds is Full...Can't Store Further..");
		}
		
	}

}
