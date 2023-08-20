package com.examples.equals.boot;

import com.examples.equals.app.Cook;

public class CookMain {

	public static void main(String[] args) {
		Cook cook = new Cook("Raj", 10 ,"Aadhya", "Biriyani", "Rajajinagar", 175);

		System.out.println(cook+"\n");

		Cook cook1 = new Cook("Raj", 10 ,"Aadhya", "Biriyani", "Rajajinagar", 175);

		System.out.println(cook1+"\n");
		
		boolean same=cook.equals(cook1);
		System.out.println("Is Contents of both objects are same : "+same);
		
		
	}

}
