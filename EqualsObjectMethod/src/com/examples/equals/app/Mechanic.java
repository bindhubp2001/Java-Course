package com.examples.equals.app;

public class Mechanic {
	private String name;
	private String shopName;
	private int age;
	private String location;
	private boolean isShopOpen;
	private boolean isShopClose;
	
	public Mechanic() {
		// TODO Auto-generated constructor stub
	}

	public Mechanic(String name, String shopName, int age, String location, boolean isShopOpen, boolean isShopClose) {
		super();
		this.name = name;
		this.shopName = shopName;
		this.age = age;
		this.location = location;
		this.isShopOpen = isShopOpen;
		this.isShopClose = isShopClose;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\n"+shopName+"\n"+age+"\n"+location+"\n"+isShopClose+"\n"+isShopOpen;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Mechanic mechanic=(Mechanic)obj;
		
		if(mechanic.name.equals(name) && mechanic.isShopClose == isShopClose && mechanic.location.equals(location) && mechanic.age == age)
			return true;
		return false;
	}
}
