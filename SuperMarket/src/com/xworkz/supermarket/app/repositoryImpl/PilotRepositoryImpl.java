package com.xworkz.supermarket.app.repositoryImpl;

import com.xworkz.supermarket.app.repository.PilotRepository;

public class PilotRepositoryImpl implements PilotRepository {

	private String[] planes = new String[10];
	private int pos;

	@Override
	public String save(String planeName) {

		if (pos < TOTAL_PLANES) {
			this.planes[pos] = planeName;
			System.out.println("Store "+planeName +" at the position "+this.pos);
			this.pos++;
		}
		else {
			System.err.println("Data Store is Full ,,,Cannot add more..");
		}

		return "Airplane";
	}

}
