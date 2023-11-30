package com.xworkz.cracker.constants;

public enum MovieDIscount {

	SSE(20), TOP_GUN(40), BARBIE(10);

	private int discount;

	private MovieDIscount(int discount) {
		this.discount = discount;
	}
	
	public int getDiscount() {
		return discount;
	}

}
