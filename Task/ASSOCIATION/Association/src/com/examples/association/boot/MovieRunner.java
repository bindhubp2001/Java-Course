package com.examples.association.boot;

import com.examples.association.app2.*;


public class MovieRunner {
	public static void main(String[] args) {
		System.out.println("Running Main Class");
		System.out.println("-----------------------------");
		
		Movie movie = new Movie();
		
		System.out.println("Movie Name : "+ movie.name);
		System.out.println("Movie Language : "+ movie.language);
		
		Producer producer = movie.producer;
		
		System.out.println("Producer Budget : "+producer.bugdet);
		System.out.println("Producer Mobile Number : "+producer.mobileNumber);
		
		Auditor auditor = producer.auditor;
		
		System.out.println("Auditor Name : "+auditor.name);
		System.out.println("Number Of Records : "+auditor.noOfRecords);
		
		Company company = auditor.company;
		
		System.out.println("Company Name : "+company.comapanyName);
		System.out.println("Located : "+company.located);
		
		
		
		
	}
}
