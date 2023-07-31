package com.xworkz.associationmethod.app;

public class Company {
	public String companyName;
	public String companyCeo;
	public String originCountry;

	public Company(String companyName, String companyCeo, String companyOriginCountry) {
		this.companyName = companyName;
		this.companyCeo = companyCeo;
		this.originCountry = companyOriginCountry;
	}

	public void companyMethod() {
		System.out.println("Company Name: " + companyName);
		System.out.println("Company Ceo: " + companyCeo);
		System.out.println("Company Origin Country: " + originCountry);
	}
}