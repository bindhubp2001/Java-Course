package com.xworkz.app.dto;

import java.util.Objects;

public class PinDTO {

	private String material;
	private Integer noOfPins;
	private Integer cost;
	private String shape;

	public PinDTO(String material, Integer noOfPins, Integer cost, String shape) {
		super();
		this.material = material;
		this.noOfPins = noOfPins;
		this.cost = cost;
		this.shape = shape;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, material, noOfPins, shape);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PinDTO other = (PinDTO) obj;
		return Objects.equals(cost, other.cost) && Objects.equals(material, other.material)
				&& Objects.equals(noOfPins, other.noOfPins) && Objects.equals(shape, other.shape);
	}

	@Override
	public String toString() {
		return "PinDTO [material=" + material + ", noOfPins=" + noOfPins + ", cost=" + cost + ", shape=" + shape + "]";
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Integer getNoOfPins() {
		return noOfPins;
	}

	public void setNoOfPins(Integer noOfPins) {
		this.noOfPins = noOfPins;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

}
