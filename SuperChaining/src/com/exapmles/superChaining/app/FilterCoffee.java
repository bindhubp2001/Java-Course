package com.exapmles.superChaining.app;

public class FilterCoffee extends Coffee {

	public FilterCoffee()
	{
		super("Light Brown",10,1500,"Cappuccinno");
		System.out.println("Calling Default Constructer");
	}
	
	public FilterCoffee(String color,int noOfCupsOrdered,int amount,String name)
	{
		super(color,noOfCupsOrdered,amount,name);
		System.out.println("Calling Parametreized Constructer");
	}
}
