package com.xworkz.Abstraction.boot;


import com.xworkz.Abstraction.app.SkyDiving;

public class AdventuresMain {

	public static void main(String[] args) {
		
		SkyDiving adventures=new SkyDiving();
		adventures.manaliTrip();
		adventures.mumbaiTrip();
		adventures.keralaTrip();
		adventures.rajasthanTrip();
		
		System.out.println("---------------------");
		
		adventures.paragliding();
		adventures.rollerCoster();
		adventures.skyDiving();
		adventures.bungeeJump();
		adventures.watergames();
	}

}
