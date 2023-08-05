package com.exapmles.superChaining.app;

public class Rope {
	public String type;
	public boolean isFlexible;
	public boolean isWaterAbsorption;
	public double meltingpoint;

	public Rope(String type, boolean isFlexible, boolean isWaterAbsorption, double meltingpoint) {
		this.isFlexible = isFlexible;
		this.isWaterAbsorption = isWaterAbsorption;
		this.type = type;
		this.meltingpoint = meltingpoint;
	}
}
