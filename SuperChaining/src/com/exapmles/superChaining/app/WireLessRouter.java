package com.exapmles.superChaining.app;

public class WireLessRouter extends Router {

	public WireLessRouter()
	{
		super("Default Routing","Access Servers ","Data Transfer","Wired router");
		System.out.println("Calling Default Constructor");
	}
	
	public WireLessRouter(String feature,String otherName,String function,String type)
	{
		super( feature, otherName, function, type);
		System.out.println("Calling parameterized constructor");
	}
}

