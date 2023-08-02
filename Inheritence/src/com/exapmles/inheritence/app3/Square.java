package com.exapmles.inheritence.app3;

public class Square extends Shape{
	public String area;

	public Square() {
		System.out.println("Calling default Constructer of Square");
	}

	public double squareMethod(double side) {
		return side*side;
	}

}
