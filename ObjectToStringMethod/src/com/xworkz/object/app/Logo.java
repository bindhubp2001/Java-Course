package com.xworkz.object.app;

public class Logo {
	private String shape;
	private int height;
	private int width;
	private String color;
	private String theme;
	
	public Logo() {
		
	}

	public Logo(String shape, int height, int width, String color, String theme) {
		super();
		this.shape = shape;
		this.height = height;
		this.width = width;
		this.color = color;
		this.theme = theme;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shape : "+shape+"\nHeight : "+height+"\nWidth : "+width+"\nColor : "+color+"\nTheme"+theme;
	}
}
