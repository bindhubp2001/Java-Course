package com.xworkz.supermarket.app.repositoryImpl;

import com.xworkz.supermarket.app.repository.GroceryRepository;

public class GroceryRepositoryImpl implements GroceryRepository{

	private String[] gorceries=new String[TOTAL_ITEMS];
	private int index;

	@Override
	public void save(String grocery) {
		if(index<TOTAL_ITEMS) {
		this.gorceries[index]=grocery;
		System.out.println("Store item "+grocery+" in position "+this.index);
		this.index++;
		}
		else {
			System.err.println("DS is full,,cannot Store Further...");
		}
	}

}
