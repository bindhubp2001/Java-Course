package com.exapmles.inheritence.app8;

public class Train {
	public int noOFCaoches;
	
	public Train()
	{
		this.noOFCaoches=20;
		System.out.println("Number of Coaches : "+this.noOFCaoches);
	}
	
	public String trainMethod()
	{
		return "Shatabdi Express";
	}	
}
