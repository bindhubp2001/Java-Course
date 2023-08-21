package com.example.inbuiltclass.app;

import java.nio.charset.Charset;

public class StringClass {
	
	// String Constructors

	public StringClass() {

		System.out.println("Calling No-arg Constructor....");
	}

	public StringClass(byte[] bytes, Charset charset) {
		System.out.println("Calling 2 paramerteized Constructor....");

	}

	public StringClass(char[] value) {
		System.out.println("Calling 1 paramerteized Constructor....");

	}
	
	

}
