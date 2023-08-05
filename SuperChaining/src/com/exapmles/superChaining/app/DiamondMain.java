package com.exapmles.superChaining.app;

public class DiamondMain {

	public static void main(String[] args) {
		System.out.println("Main...................");
		Ruby ruby=new Ruby();
		System.out.println(ruby.color);
		System.out.println(ruby.isElectricResistivity);
		System.out.println(ruby.hardness);
		System.out.println(ruby.weight);
		
		System.out.println("---------------");
		
		Ruby ruby2=new Ruby(true,500,"Red",800);
		System.out.println(ruby2.color);
		System.out.println(ruby2.isElectricResistivity);
		System.out.println(ruby2.hardness);
		System.out.println(ruby2.weight);
		

	}

}
  