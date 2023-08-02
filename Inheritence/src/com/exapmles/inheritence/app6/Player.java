package com.exapmles.inheritence.app6;

public class Player extends Person{
public String gameName="Cricket";
	
	public Player() {
		System.out.println("Calling Default Constructor");
	}
	
	public void playerMethod()
	{
		System.out.println("gameMethod : "+gameName);
	}
}
