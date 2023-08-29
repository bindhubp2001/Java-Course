package com.xworkz.association.app;

public class Mobile {
	String shape;
	private Charger charger;
	
	public Mobile(String structure) {
		shape=structure;
		System.out.println("Shape of Mobile : "+shape+"\n");
	}
	
	public void setCharger(Charger charger) {
		this.charger=charger;
	}
	
	public void brandName() {
		System.out.println("Calling brandName method in Mobile Class,,,");
		this.charger.charge();
	}
	
	public String brandName(String name) {
		System.out.println("Calling brandName method with String Parameter in Mobile Class,,,");
		System.out.println("Name : "+name);
		this.charger.charge(12);
		return "SamSung";
	}
	
	
	public int brandName(int noOFPhone) {
		System.out.println("Calling brandName method with int parameter in Mobile Class,,,");
		System.out.println("No of Phone : "+noOFPhone);
		this.charger.charge('C');
		return 10;
	}
	
	
	public void brandName(double price) {
		System.out.println("Calling brandName method with double parameter in Mobile Class,,,");
		System.out.println("Price : "+price);
		this.charger.charge(999);
	}
	
	
	
}
