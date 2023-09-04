package com.xworkz.supermarket.app.repositoryImpl;

import com.xworkz.supermarket.app.repository.JacketRepository;

public class JacketrepositoryImpl implements JacketRepository {

	private String[] jackets = new String[10];
	private int index;

	@Override
	public void save(String cloth) {
		if (index < TOTAL_JACKETS) {
			this.jackets[index] = cloth;
			System.out.println("Save cloth" + cloth + " at position " + index);
			index++;
		} else {
			System.err.println("DS is Full Cannot Store more...");
		}
	}

}
