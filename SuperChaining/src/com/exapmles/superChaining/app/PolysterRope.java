package com.exapmles.superChaining.app;

public class PolysterRope extends Rope {
	public PolysterRope() {
		super("JUTE ", true, true, 250);
		System.out.println("Calling Default Constructor...........");
	}
	
	public PolysterRope(String type, boolean isFlexible, boolean isWaterAbsorption, double meltingpoint) {
		super(type,  isFlexible,  isWaterAbsorption,  meltingpoint);
		System.out.println("Calling Default Constructor...........");
	}
}
