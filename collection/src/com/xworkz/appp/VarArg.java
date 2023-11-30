package com.xworkz.appp;

public class VarArg {
	public static void varMethod(String... values) {
		for(String s:values)
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		varMethod("Bindhu","Sam","Shree");

	}
	
	

}
