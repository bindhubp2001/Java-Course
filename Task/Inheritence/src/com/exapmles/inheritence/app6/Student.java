package com.exapmles.inheritence.app6;

public class Student extends Person{
public boolean isStudying=true;
	
	public Student() {
		System.out.println("Calling Default Constructor");
	}
	
	public void studentMethod()
	{
		System.out.println("IS Studying : "+isStudying);
	}
}
