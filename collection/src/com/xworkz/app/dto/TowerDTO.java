package com.xworkz.app.dto;

public class TowerDTO implements Comparable<TowerDTO> {

	private String name;
	private double height;
	private double width;
	private String locatedPlace;

	public TowerDTO(String name, double height, double width, String locatedPlace) {
		super();
		this.name = name;
		this.height = height;
		this.width = width;
		this.locatedPlace = locatedPlace;
	}

	@Override
	public String toString() {
		return "TowerDTO [name=" + name + ", height=" + height + ", width=" + width + ", locatedPlace=" + locatedPlace
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getLocatedPlace() {
		return locatedPlace;
	}

	public void setLocatedPlace(String locatedPlace) {
		this.locatedPlace = locatedPlace;
	}

	@Override
	public int compareTo(TowerDTO o) {
		
		TowerDTO current = this;
		
		return current.locatedPlace.compareTo(o.locatedPlace);
	}

	
}
