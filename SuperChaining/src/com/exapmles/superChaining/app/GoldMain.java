package com.exapmles.superChaining.app;

public class GoldMain {

	public static void main(String[] args) {
		System.out.println("Running Main..........");
		RoseGold gold=new RoseGold();
		System.out.println(gold.atomicWeight);
		System.out.println(gold.meltingPoint);
		System.out.println(gold.boilingPoint);
		System.out.println(gold.gram);
		
		System.out.println("---------------");
		
		RoseGold gold1=new RoseGold(90,34555,1763,197);
		System.out.println(gold1.atomicWeight);
		System.out.println(gold1.meltingPoint);
		System.out.println(gold1.boilingPoint);
		System.out.println(gold1.gram);
	}

}
