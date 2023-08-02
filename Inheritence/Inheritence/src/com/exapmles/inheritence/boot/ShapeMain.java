package com.exapmles.inheritence.boot;

import com.exapmles.inheritence.app3.*;

public class ShapeMain {
	public static void main(String[] args) {
		Shape shape =new Shape();
		shape.shapeMethod();
		System.out.println("----------------------");
		
		Circle circle=new Circle();
		System.out.println(circle.circleMethod(6));
		circle.shapeMethod();
		System.out.println("----------------------");
		
		Rectangle rectangle=new Rectangle();
		rectangle.shapeMethod();
		System.out.println(rectangle.rectangleMethod(5, 6));
		System.out.println("----------------------");
		
		Square square=new Square();
		square.shapeMethod();
		System.out.println(square.squareMethod(5));
		System.out.println("----------------------");
		
		Pentagon pentagon=new Pentagon();
		pentagon.shapeMethod();
		pentagon.pentagonMethod();
		System.out.println("----------------------");
		
		Oval oval=new Oval();
		oval.ovalMethod();
		oval.shapeMethod();
		System.out.println("----------------------");
		
		Rombus rombus=new Rombus();
		rombus.rombusMethod();
		rombus.shapeMethod();
	}
	
}
