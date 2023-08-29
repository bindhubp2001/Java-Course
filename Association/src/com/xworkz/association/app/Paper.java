package com.xworkz.association.app;

public class Paper {
	String type;
	private Wood wood;
	
	public Paper(String type) {
		this.type=type;
		System.out.println(this.type);
	}
	
	public void setWood(Wood wood) {
		this.wood=wood;
	}
	
	public void write() {
		System.out.println("Calling write in Paper Class...");
		this.wood.cut();
	}
}
