package com.xworkz.object.app;

public class Flag {
	private int height;
	private int width;
	private String color;
	
	public Flag() {
		// TODO Auto-generated constructor stub
	}

	public Flag(int height, int width, String color) {
		super();
		this.height = height;
		this.width = width;
		this.color = color;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return height+"\n"+width+"\n"+color;
	}
}
