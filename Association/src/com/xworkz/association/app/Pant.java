package com.xworkz.association.app;

public class Pant {
	String style;
	private Zip zip;

	public Pant(String style) {
		this.style = style;
		System.out.println(this.style);
	}

	public void setZip(Zip zip) {
		this.zip = zip;
	}

	public void wash() {
		System.out.println("Calling wash method in Pant Class....");
		this.zip.totalZip();
	}

}
