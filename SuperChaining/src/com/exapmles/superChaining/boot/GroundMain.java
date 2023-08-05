package com.exapmles.superChaining.boot;

import com.exapmles.superChaining.app.*;

public class GroundMain {
	public static void main(String[] args) {
		System.out.println("Running Main...............");
		Stadium stadium=new Stadium();
		System.out.println(stadium.area);
		System.out.println(stadium.location);
		System.out.println(stadium.name);
		System.out.println(stadium.noOfSeats);
		
		System.out.println("--------------");
		Stadium stadium2=new Stadium(5000,"Bangalore",30000,"Katirava");
		System.out.println(stadium2.area);
		System.out.println(stadium2.location);
		System.out.println(stadium2.name);
		System.out.println(stadium2.noOfSeats);
	}
}
