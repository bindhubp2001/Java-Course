package com.exapmles.superChaining.boot;

import com.exapmles.superChaining.app.*;

public class CoffeeMain {
	public static void main(String[] args) {
		System.out.println("'Main.............");
		FilterCoffee coffee=new FilterCoffee();
		System.out.println(coffee.amount);
		System.out.println(coffee.color);
		System.out.println(coffee.name);
		System.out.println(coffee.noOfCupsOrdered);
		
		System.out.println("------------------");
		FilterCoffee coffee1=new FilterCoffee("Balck",8,5000,"BlackCoffee");
		System.out.println(coffee1.amount);
		System.out.println(coffee1.color);
		System.out.println(coffee1.name);
		System.out.println(coffee1.noOfCupsOrdered);
		
	}
}
