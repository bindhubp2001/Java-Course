package com.xworkz.app.dto;

public class PendriveDTO implements Comparable<PendriveDTO>{
	
	private String brand;
	private int storage;
	private double Price;
	private String color;
	
	public PendriveDTO(String brand, int storage, double price, String color) {
		super();
		this.brand = brand;
		this.storage = storage;
		Price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "PendriveDTO [brand=" + brand + ", storage=" + storage + ", Price=" + Price + ", color=" + color + "]";
	}

	@Override
	public int compareTo(PendriveDTO arg) {
		
		PendriveDTO current = this;
		
		return current.color.compareTo(arg.color); 

	}
	
	
	

}
