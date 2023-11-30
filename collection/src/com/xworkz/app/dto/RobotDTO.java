package com.xworkz.app.dto;

public class RobotDTO implements Comparable<RobotDTO>{
	
	private String material;
	private double height;
	private double weight;
	private String purpose;
	
	public RobotDTO(String material, double height, double weight, String purpose) {
		super();
		this.material = material;
		this.height = height;
		this.weight = weight;
		this.purpose = purpose;
	}

	@Override
	public String toString() {
		return "RobotDTO [material=" + material + ", height=" + height + ", weight=" + weight + ", purpose=" + purpose
				+ "]";
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	@Override
	public int compareTo(RobotDTO o) {
		
		RobotDTO current = this;
		
		return current.purpose.compareTo(o.purpose);
	}
	
	

}
