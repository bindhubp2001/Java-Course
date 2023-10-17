package com.xworkz.servlets.dto;

public class AddressDTO {
	private String houseNumber;
	private String state;
	private String city;
	private String street;
	private String country;

	public AddressDTO() {

	}

	public AddressDTO(String houseNumber, String state, String city, String street, String country) {
		super();
		this.houseNumber = houseNumber;
		this.state = state;
		this.city = city;
		this.street = street;
		this.country = country;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
