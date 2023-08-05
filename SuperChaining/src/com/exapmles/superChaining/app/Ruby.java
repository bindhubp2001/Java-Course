package com.exapmles.superChaining.app;

public class Ruby extends Diamond{
	public Ruby()
	{
		super(true,400,"Blue",60);
		System.out.println("Calling NO_ARG Constructer");
	}
	
	public Ruby(boolean isElectricResistivity,double hardness,String color,double weight)
	{
		super(isElectricResistivity,hardness,color,weight);
		System.out.println("Calling Parameterized Constructer");
	}
}
