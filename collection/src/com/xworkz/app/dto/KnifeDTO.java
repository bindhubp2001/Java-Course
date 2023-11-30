package com.xworkz.app.dto;

import java.util.Objects;

public class KnifeDTO {

	private String material;
	private String purpose;
	private Integer csot;
	private Integer noOfKnife;

	public KnifeDTO(String material, String purpose, Integer csot, Integer noOfKnife) {
		super();
		this.material = material;
		this.purpose = purpose;
		this.csot = csot;
		this.noOfKnife = noOfKnife;
	}

	@Override
	public String toString() {
		return "KnifeDTO [material=" + material + ", purpose=" + purpose + ", csot=" + csot + ", noOfKnife=" + noOfKnife
				+ "]";
	}


	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Integer getCsot() {
		return csot;
	}

	public void setCsot(Integer csot) {
		this.csot = csot;
	}

	public Integer getNoOfKnife() {
		return noOfKnife;
	}

	public void setNoOfKnife(Integer noOfKnife) {
		this.noOfKnife = noOfKnife;
	}

	@Override
	public int hashCode() {
		return Objects.hash(csot, material, noOfKnife, purpose);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KnifeDTO other = (KnifeDTO) obj;
		return Objects.equals(csot, other.csot) && Objects.equals(material, other.material)
				&& Objects.equals(noOfKnife, other.noOfKnife) && Objects.equals(purpose, other.purpose);
	}

}
