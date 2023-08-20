package com.examples.equals.boot;

import com.examples.equals.app.CEO;

public class CeoMain {

	public static void main(String[] args) {
		CEO ceo = new CEO("K. Krithivasan","TCS",true,30,"Banglore",800000);
		System.out.println(ceo + "\n");

		CEO ceo2 = new CEO("Arvind Krishna","ibm",true,60,"Banglore",900000);
		System.out.println(ceo2 + "\n");

		boolean same = ceo.equals(ceo2);
		System.out.println("IS Contents are same : " + same);

	}

}
