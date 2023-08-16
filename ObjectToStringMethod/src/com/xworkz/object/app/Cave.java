package com.xworkz.object.app;

public class Cave {
	private String material;
	private int height;
	private int width;
	private boolean isSafe;
	private boolean isLionPresent;
	private String food;
	private String location;
	private boolean isInZoo;
	private int noOfAnimal;
	private String animalName;
	
	public Cave() {
		// TODO Auto-generated constructor stub
	}

	public Cave(String material, int height, int width, boolean isSafe, boolean isLionPresent, String food,
			String location, boolean isInZoo, int noOfAnimal, String animalName) {
		super();
		this.material = material;
		this.height = height;
		this.width = width;
		this.isSafe = isSafe;
		this.isLionPresent = isLionPresent;
		this.food = food;
		this.location = location;
		this.isInZoo = isInZoo;
		this.noOfAnimal = noOfAnimal;
		this.animalName = animalName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material+"\n"+height+"\n"+width+"\n"+isInZoo+"\n"+isLionPresent+"\n"+isSafe+"\n"+animalName+"\n"+food+"\n"+location+"\n"+noOfAnimal;
	}
}
