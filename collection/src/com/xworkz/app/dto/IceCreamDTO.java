package com.xworkz.app.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class IceCreamDTO implements Serializable, Cloneable {

	private String flavor;
	private Double price;
	private String color;
	private LocalDate manfactureDate;

	
	public IceCreamDTO() {
	
	}
	public IceCreamDTO(String flavor, Double price, String color, LocalDate manfactureDate) {
		super();
		this.flavor = flavor;
		this.price = price;
		this.color = color;
		this.manfactureDate = manfactureDate;
	}

	@Override
	public IceCreamDTO clone() throws CloneNotSupportedException {
		System.out.println("running clone in IceCreamDTO..");
		return (IceCreamDTO) super.clone();
	}
	
	

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public LocalDate getManfactureDate() {
		return manfactureDate;
	}

	public void setManfactureDate(LocalDate manfactureDate) {
		this.manfactureDate = manfactureDate;
	}

	@Override
	public String toString() {
		return "IceCreamDTO [flavor=" + flavor + ", price=" + price + ", color=" + color + ", manfactureDate="
				+ manfactureDate + "]";
	}

}
