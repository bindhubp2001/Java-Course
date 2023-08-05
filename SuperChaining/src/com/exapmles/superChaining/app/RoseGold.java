package com.exapmles.superChaining.app;

public class RoseGold extends Gold{
	public RoseGold() {
		super(30,1337.33,3128,197);
		System.out.println("Calling NO_ARG Constructor");
	}
	
	public RoseGold(double gram,double meltingPoint,double boilingPoint,int atomicWeight) {
		super(gram,meltingPoint,boilingPoint,atomicWeight);
		System.out.println("Calling Parameterized Constructor");
	}
}
