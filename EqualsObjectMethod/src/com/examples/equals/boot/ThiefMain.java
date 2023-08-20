package com.examples.equals.boot;

import com.examples.equals.app.Thief;

public class ThiefMain {

	public static void main(String[] args) {
		Thief thief = new Thief("Ram", 32, 420, "Central Jail", 2, "Delhi");

		System.out.println(thief + "\n");

		Thief thief2 = new Thief("Ram", 32, 420, "Central Jail", 2, "Delhi");

		System.out.println(thief2 + "\n");

		boolean same = thief.equals(thief2);

		System.out.println("BOTH OBJECTS ARE SAME : "+same);

	}

}
