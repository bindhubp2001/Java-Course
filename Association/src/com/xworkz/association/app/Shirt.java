package com.xworkz.association.app;

public class Shirt {
	String cloth;
	private Button button;

	public Shirt(String cloth) {
		this.cloth = cloth;
		System.out.println(this.cloth);
	}

	public void setButton(Button button) {
		this.button=button;
	}
	
	public String stich() {
		System.out.println("totalButton Method returns : " + this.button.totalButton());
		return "Rayon";
	}
}
