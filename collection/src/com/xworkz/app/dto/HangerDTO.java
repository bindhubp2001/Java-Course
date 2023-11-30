package com.xworkz.app.dto;

import java.util.Objects;

public class HangerDTO {

	private String color;
	private Integer noOfHangers;
	private Integer cost;
	private String pupose;

	public HangerDTO(String color, Integer noOfHangers, Integer cost, String pupose) {
		super();
		this.color = color;
		this.noOfHangers = noOfHangers;
		this.cost = cost;
		this.pupose = pupose;
	}

	@Override
	public String toString() {
		return "HangerDTO [color=" + color + ", noOfHangers=" + noOfHangers + ", cost=" + cost + ", pupose=" + pupose
				+ "]";
	}

	@Override
	public int hashCode() {
		return 200;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HangerDTO other = (HangerDTO) obj;
		return Objects.equals(color, other.color) && Objects.equals(cost, other.cost)
				&& Objects.equals(noOfHangers, other.noOfHangers) && Objects.equals(pupose, other.pupose);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getNoOfHangers() {
		return noOfHangers;
	}

	public void setNoOfHangers(Integer noOfHangers) {
		this.noOfHangers = noOfHangers;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public String getPupose() {
		return pupose;
	}

	public void setPupose(String pupose) {
		this.pupose = pupose;
	}

}
