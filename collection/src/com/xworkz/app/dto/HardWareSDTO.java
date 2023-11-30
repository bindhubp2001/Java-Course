package com.xworkz.app.dto;

import java.util.Objects;

public class HardWareSDTO {
	
	private String name;
	private Integer cost;
	private String use;
	private Integer noOfhardware;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public Integer getNoOfhardware() {
		return noOfhardware;
	}

	public void setNoOfhardware(Integer noOfhardware) {
		this.noOfhardware = noOfhardware;
	}

	@Override
	public int hashCode() {
		return 123;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HardWareSDTO other = (HardWareSDTO) obj;
		return Objects.equals(cost, other.cost) && Objects.equals(name, other.name)
				&& Objects.equals(noOfhardware, other.noOfhardware) && Objects.equals(use, other.use);
	}

	@Override
	public String toString() {
		return "HardWareSDTO [name=" + name + ", cost=" + cost + ", use=" + use + ", noOfhardware=" + noOfhardware
				+ "]";
	}

	public HardWareSDTO(String name, Integer cost, String use, Integer noOfhardware) {
		super();
		this.name = name;
		this.cost = cost;
		this.use = use;
		this.noOfhardware = noOfhardware;
	} 
	

}
