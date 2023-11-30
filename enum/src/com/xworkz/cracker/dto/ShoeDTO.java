package com.xworkz.cracker.dto;

import com.xworkz.cracker.constants.ShoeType;
import com.xworkz.cracker.constants.SizeType;

public class ShoeDTO {

	private String brand;
	private SizeType size;//using constructor
	private ShoeType type=ShoeType.SPORTSWEAR;//init using literals
	private Double cost;//using setters
	
	public ShoeDTO(SizeType size) {
		this.size=size;
	}
	
	@Override
	public String toString() {
		return "ShoeDTO [brand=" + brand + ", size=" + size + ", type=" + type + ", cost=" + cost + "]";
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
}
