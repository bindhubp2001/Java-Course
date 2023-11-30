package com.xworkz.app.dto;

import java.util.Objects;

public class CrackerDTO {

	private String name;
	private Integer noOfCracker;
	private Double cost;
	private String color;

	public CrackerDTO(String name, Integer noOfCracker, Double cost, String color) {
		super();
		this.name = name;
		this.noOfCracker = noOfCracker;
		this.cost = cost;
		this.color = color;
	}

	@Override
	public String toString() {
		return "CrackerDTO [name=" + name + ", noOfCracker=" + noOfCracker + ", cost=" + cost + ", color=" + color
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoOfCracker() {
		return noOfCracker;
	}

	public void setNoOfCracker(Integer noOfCracker) {
		this.noOfCracker = noOfCracker;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		return 122;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CrackerDTO other = (CrackerDTO) obj;
		return Objects.equals(color, other.color) && Objects.equals(cost, other.cost)
				&& Objects.equals(name, other.name) && Objects.equals(noOfCracker, other.noOfCracker);
	}

}
