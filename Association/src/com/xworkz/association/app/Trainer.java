package com.xworkz.association.app;

public class Trainer {

	String trainerName;
	private Laptop laptop;

	public Trainer(String trainerName) {
		System.out.println("Trainer Name : " + trainerName);
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void teach() {

		System.out.println("Calling teach Method in Trainer...");
		this.laptop.process();
	}
}
