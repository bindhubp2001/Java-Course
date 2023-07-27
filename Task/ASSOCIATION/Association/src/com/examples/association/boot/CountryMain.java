package com.examples.association.boot;

import com.examples.association.app3.*;


public class CountryMain {
	public static void main(String[] args) {
		System.out.println(" Calling Country Main Class");
		System.out.println("---------------------------------");
		
		Country country = new Country();
		
		System.out.println("\n Country Name : "+country.countryName);
		System.out.println(" Country Code : "+country.code);
		
		President president = country.president;
		
		System.out.println("\n President Name : "+president.presidentName);
		System.out.println(" Presedent Gender : "+president.gender);
		
		StateFrom sf=president.statefrom;
		
		System.out.println("\n State From : "+sf.stateName);
		System.out.println(" Village"+sf.village);
		
		PrimeMinister pm=country.pm;
		
		System.out.println("\n Prime Mnister Name : "+pm.primeMinisterName);
		System.out.println(" IS Marital Status Single : "+pm.isSingle);
		
		SecurityHead sh = pm.security;
		
		System.out.println("\n Security Salary : "+sh.securitySalary);
		System.out.println(" Security Force Name : "+sh.forceName);
		
		PersonalAssistant pa=pm.pa;
		
		System.out.println("\n Personal Assitent Name : "+pa.paName);
		System.out.println(" Nationality : "+pa.nationality);
		
		HomeMinister hm = pm.hm;
		
		System.out.println("\n Home Minister Name : "+hm.hmName);
		System.out.println(" Home Minister Age : "+hm.hmName);
		
		
	}
}
