package com.examples.equals.boot;

import com.examples.equals.app.Minister;

public class MinisterMain {

	public static void main(String[] args) {
		System.out.println("Running Main.........");

		Minister minister = new Minister("BSY", 30, 15, "CM", "Banglore", 2000000);

		Minister minister2 = new Minister("BSY", 30, 15, "CM", "Manglore", 2000000);

		System.out.println(minister);

		System.out.println();

		System.out.println(minister2);

		boolean same = minister.equals(minister2);

		System.out.println();

		System.out.println("IS Contents of Object Same : " + same);
	}

}
