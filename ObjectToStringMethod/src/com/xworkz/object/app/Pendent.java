package com.xworkz.object.app;

public class Pendent {
	private String material;
	private String color;
	private double gram;
	private double cost;
	private boolean isQualityGood;
	private String shopName;
	private String shape;
	private String design;
	private int height;
	private int width;
	private int noOfPendent;
	private boolean isAvialable;
	
	public Pendent() {
		// TODO Auto-generated constructor stub
	}

	public Pendent(String material, String color, double gram, double cost, boolean isQualityGood, String shopName,
			String shape, String design, int height, int width, int noOfPendent, boolean isAvialable) {
		super();
		this.material = material;
		this.color = color;
		this.gram = gram;
		this.cost = cost;
		this.isQualityGood = isQualityGood;
		this.shopName = shopName;
		this.shape = shape;
		this.design = design;
		this.height = height;
		this.width = width;
		this.noOfPendent = noOfPendent;
		this.isAvialable = isAvialable;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material+"\n"+color+"\n"+gram+"\n"+cost+"\n"+isAvialable+"\n"+isQualityGood+"\n"+shopName+"\n"+shape+"\n"+design+"\n"+height+"\n"+width+"\n"+noOfPendent;
	}
	
}
