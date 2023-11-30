package com.xworkz.app.dto;

import java.util.Objects;

public class BridgeDTO {
	
	private Double height;
	private Double width;
	private String name;
	private String location;

	public BridgeDTO(Double height, Double width, String name, String location) {
		super();
		this.height = height;
		this.width = width;
		this.name = name;
		this.location = location;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		return 98;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BridgeDTO other = (BridgeDTO) obj;
		return Objects.equals(height, other.height) && Objects.equals(location, other.location)
				&& Objects.equals(name, other.name) && Objects.equals(width, other.width);
	}

	@Override
	public String toString() {
		return "BridgeDTO [height=" + height + ", width=" + width + ", name=" + name + ", location=" + location + "]";
	}

}
