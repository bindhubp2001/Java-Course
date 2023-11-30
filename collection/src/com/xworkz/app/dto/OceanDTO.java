package com.xworkz.app.dto;

public class OceanDTO implements Comparable<OceanDTO>{
	
	private String species;
	private double saltPercent;
	private double percentOfWater;
	private String colorOfWater;
	
	public OceanDTO(String species, double saltPercent, double percentOfWater, String colorOfWater) {
		super();
		this.species = species;
		this.saltPercent = saltPercent;
		this.percentOfWater = percentOfWater;
		this.colorOfWater = colorOfWater;
	}

	@Override
	public String toString() {
		return "OceanDTO [species=" + species + ", saltPercent=" + saltPercent + ", percentOfWater=" + percentOfWater
				+ ", colorOfWater=" + colorOfWater + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public double getSaltPercent() {
		return saltPercent;
	}

	public void setSaltPercent(double saltPercent) {
		this.saltPercent = saltPercent;
	}

	public double getPercentOfWater() {
		return percentOfWater;
	}

	public void setPercentOfWater(double percentOfWater) {
		this.percentOfWater = percentOfWater;
	}

	public String getColorOfWater() {
		return colorOfWater;
	}

	public void setColorOfWater(String colorOfWater) {
		this.colorOfWater = colorOfWater;
	}

	@Override
	public int compareTo(OceanDTO arg) {
		
		OceanDTO current = this;
		
		if(current.percentOfWater == arg.percentOfWater) {
			return 0;
		}
		
		if(current.percentOfWater > arg.percentOfWater) {
			return 1;
		}
		
		if(current.percentOfWater < arg.percentOfWater) {
			return -1;
		}
		
		throw new ClassCastException("Cannot Compares....");
	}
	

}
