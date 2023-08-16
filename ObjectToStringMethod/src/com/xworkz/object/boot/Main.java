package com.xworkz.object.boot;

import com.xworkz.object.app.*;

public class Main {

	public static void main(String[] args) {
		Logo logo=new Logo();
		System.out.println(logo);
		
		Logo logo2=new Logo("Circle", 10, 5,"Black", "Avnegers");
		System.out.println(logo2);
		
		Logo logo3=new Logo("Cone", 20, 15,"White", "MotuPatlu");
		System.out.println(logo3);
		
		System.out.println("-------------------------");
		
		HandTowel handTowel=new HandTowel();
		System.out.println(handTowel);
		
		HandTowel handTowel1=new HandTowel("Blue", "Woolen", 100, true, 10, 10, false);
		System.out.println(handTowel1);
		
		HandTowel handTowel2=new HandTowel("Brown", "Cotten", 200, true, 20, 7, true);
		System.out.println(handTowel2);
		
		System.out.println("-------------------------");
		
		Flag flag=new Flag();
		System.out.println(flag);
		
		Flag flag1=new Flag(30,20,"Safron");
		System.out.println(flag1);
		
		Flag flag2=new Flag(20,10,"Green");
		System.out.println(flag2);
		
		System.out.println("-------------------------");
		
		Cave cave=new Cave();
		System.out.println(cave);
		
		Cave cave1=new Cave("Stone", 17, 50, true, false, "Leafs", "Bandipur", false, 10, "Lion");
		System.out.println(cave1);
		
		Cave cave2=new Cave("Stone", 39, 40, true, true, "Meat", "Mandya", true, 9, "Tiger");
		System.out.println(cave2);
		
		System.out.println("-------------------------");
		
		Pendent pendent=new Pendent();
		System.out.println(pendent);
		
		Pendent pendent1=new Pendent( "Diamond",  "Maroon",  30,  99.900000,  true,  "Lalitha Jewelwers", "Rhombus",  "Fish",  8,  5,  2,  true);
		System.out.println(pendent1);
		
		Pendent pendent2=new Pendent("Ruby",  "Green", 20,  89.9000,  true,  "Joyolukas", "Circle",  "Dandelion",  7,  4,  2,  true);
		System.out.println(pendent2);
		
		
		
		

	}

}
