package com.xworkz.app.dto;

import java.util.Objects;

public class TireDTO {

	private String name;
	private String madeOf;
	private Integer noOfTyres;
	private String forVehicle;

	public TireDTO(String name, String madeOf, Integer noOfTyres, String forVehicle) {
		super();
		this.name = name;
		this.madeOf = madeOf;
		this.noOfTyres = noOfTyres;
		this.forVehicle = forVehicle;
	}

	@Override
	public String toString() {
		return "TireDTO [name=" + name + ", madeOf=" + madeOf + ", noOfTyres=" + noOfTyres + ", forVehicle="
				+ forVehicle + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeOf() {
		return madeOf;
	}

	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}

	public Integer getNoOfTyres() {
		return noOfTyres;
	}

	public void setNoOfTyres(Integer noOfTyres) {
		this.noOfTyres = noOfTyres;
	}

	public String getForVehicle() {
		return forVehicle;
	}

	public void setForVehicle(String forVehicle) {
		this.forVehicle = forVehicle;
	}

	@Override
	public int hashCode() {
		return 165;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TireDTO other = (TireDTO) obj;
		return Objects.equals(forVehicle, other.forVehicle) && Objects.equals(madeOf, other.madeOf)
				&& Objects.equals(name, other.name) && Objects.equals(noOfTyres, other.noOfTyres);
	}

}
