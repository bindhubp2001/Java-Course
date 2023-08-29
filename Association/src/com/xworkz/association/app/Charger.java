package com.xworkz.association.app;

public class Charger {
	public void charge() {
		System.out.println("Invoking charge method in charge Class.....");
	}
	
	public int charge(int volt) {
		System.out.println("Invoking charge method with STRING parameter in charge Class.....");
		System.out.println("Volt : "+volt);
		return 10;
	}
	
	public char charge(char chargerType) {
		System.out.println("Invoking charge method with CHAR parameter in charge Class.....");
		System.out.println("Charger Type : "+chargerType);
		return 'C';
	}
	
	public double charge(double price) {
		System.out.println("Invoking charge method with DOUBLE in charge Class.....");
		System.out.println("Price : "+price);
		return 999;
	}
}
