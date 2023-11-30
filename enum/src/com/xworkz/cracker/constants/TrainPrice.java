package com.xworkz.cracker.constants;

public enum TrainPrice {

	TWO_THOUSAND(2000d),THREE_THOUSAND(3000d),FOUR_THOUSAND(4000d);
	
	private Double cost;
	
	TrainPrice(Double cost) {
		this.cost=cost;
	}
	
	public Double getCost() {
		return cost;
	}
	
	public void setCost(Double cost) {
		this.cost = cost;
	}	
}
