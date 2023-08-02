package com.exapmles.inheritence.app8;

public class Metro extends Train{
public int noOFStops;
	
	public Metro()
	{
		this.noOFStops=15;
		System.out.println("No Of Stops : "+this.noOFStops);
	}
	
	public String metroMethod()
	{
		return "GreenLine";
	}	
}
