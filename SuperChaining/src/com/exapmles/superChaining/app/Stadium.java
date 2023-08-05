package com.exapmles.superChaining.app;

public class Stadium extends Ground{
	public Stadium() {
		super(2000,"Chitradurga",1000,"Modi Stadium");
		System.out.println("Calling No-Arg Construter");
	}
	
	public Stadium(double area,String location,int noOfSeats,String name) {
		super(area, location,noOfSeats,name);
		System.out.println("Calling No-Arg Construter");
	}
}
