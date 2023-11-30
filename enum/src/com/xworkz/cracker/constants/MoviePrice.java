package com.xworkz.cracker.constants;

public enum MoviePrice {
	
	TWO_HUNDRED(200),THREE_HUNDRED(300),SIX_HUNDRED(600);
	
	private int price;
	
	private MoviePrice(int price) {
		this.price=price;
	}

	public int getPrice() {
		return price;
	}
}
