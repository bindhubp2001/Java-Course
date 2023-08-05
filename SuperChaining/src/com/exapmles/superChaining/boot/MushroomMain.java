package com.exapmles.superChaining.boot;

import com.exapmles.superChaining.app.*;

public class MushroomMain {

	public static void main(String[] args) {
		
		System.out.println("Running main..........");
		ButtonMushroom buttonMushroom=new ButtonMushroom();
		System.out.println(buttonMushroom.type);
		System.out.println(buttonMushroom.richProductionState);
		System.out.println(buttonMushroom.isAntioxident);
		System.out.println(buttonMushroom.vitamin);
		
		System.out.println("---------------");
		
		ButtonMushroom buttonMushroom2=new ButtonMushroom("BeechMushroom", 'B', "UP", true);
		System.out.println(buttonMushroom2.type);
		System.out.println(buttonMushroom2.richProductionState);
		System.out.println(buttonMushroom2.isAntioxident);
		System.out.println(buttonMushroom2.vitamin);
		

	}

}
