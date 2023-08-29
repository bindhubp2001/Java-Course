package com.xworkz.association.app;

public class Bus {
	String type;
	private Passenger passenger;
	
	public Bus(String type) {
		this.type=type;
		System.out.println("Bus Name : "+this.type);
	}
	
	public void setPassenger(Passenger passenger) {
		this.passenger=passenger;
	}
	
	public void drive() {
		System.out.println("Calling drive method in Bus Class..");
		System.out.println("totalPassenger Method From Passenger Class returns : "+this.passenger.totalPassesnger());
	}
}
