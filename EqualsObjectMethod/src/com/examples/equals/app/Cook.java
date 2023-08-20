package com.examples.equals.app;

public class Cook {
	private String name;
	private int exp;
	private String shopName;
	private String recepi;
	private String location;
	private double price;
	
	
	public Cook() {
		
	}


	public Cook(String name, int exp, String shopName, String recepi, String location, double price) {
		super();
		this.name = name;
		this.exp = exp;
		this.shopName = shopName;
		this.recepi = recepi;
		this.location = location;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return name+"\n"+exp+"\n"+shopName+"\n"+recepi+"\n"+location+"\n"+price;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Cook cook=(Cook)obj;
		
		if(cook.name.equals(this.name) && cook.exp == this.exp && cook.shopName.equals(this.shopName) && cook.recepi.equals(this.recepi) && cook.price == this.price)
			return true;
		return false;
	}
}
