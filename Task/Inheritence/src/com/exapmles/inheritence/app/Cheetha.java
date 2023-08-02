package com.exapmles.inheritence.app;

public class Cheetha extends Animal{
	 public double speed = 180;
	 public Cheetha()
		{
			System.out.println("Calling default Constructor of Cheetha Class");
		}
	 public void cheethaMethod()
	 {
		 System.out.println("Running Cheetha Method");
		 System.out.println("Speed per hour : "+speed);
	 }
}
