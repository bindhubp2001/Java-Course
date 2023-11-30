package com.xworkz.cracker.dto;

import com.xworkz.cracker.constants.TrainPrice;

public class TrainDTO {

	private String name;
	private String destination = "Delhi";
	private TrainPrice price;

	
	
	public TrainDTO(String name,TrainPrice price) {
		super();
		this.name = name;
	
		this.price = price;
	}

	@Override
	public String toString() {
		return "TrainDTO [name=" + name + ", destination=" + destination + ", price=" + price + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
}
