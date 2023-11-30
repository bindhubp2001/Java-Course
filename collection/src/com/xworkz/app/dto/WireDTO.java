package com.xworkz.app.dto;

import java.util.Objects;

public class WireDTO {

	private Double height;
	private Double width;
	private String material;
	private String pupose;

	public WireDTO(Double height, Double width, String material, String pupose) {
		super();
		this.height = height;
		this.width = width;
		this.material = material;
		this.pupose = pupose;
	}

	@Override
	public int hashCode() {
		return 99;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WireDTO other = (WireDTO) obj;
		return Objects.equals(height, other.height) && Objects.equals(material, other.material)
				&& Objects.equals(pupose, other.pupose) && Objects.equals(width, other.width);
	}

	@Override
	public String toString() {
		return "WireDTO [height=" + height + ", width=" + width + ", material=" + material + ", pupose=" + pupose + "]";
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getPupose() {
		return pupose;
	}

	public void setPupose(String pupose) {
		this.pupose = pupose;
	}

}
