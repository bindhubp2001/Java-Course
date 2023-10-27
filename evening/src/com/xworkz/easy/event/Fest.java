package com.xworkz.easy.event;

import java.io.FileNotFoundException;

import javax.management.RuntimeErrorException;

import com.xworkz.easy.event.app.TeaRuntime;

public class Fest {

	public void celebrate()throws FileNotFoundException  {
		System.out.println("Celebrate method...");
		throw new FileNotFoundException();
	}
	
	public void dinner() {
		System.out.println("Dinner Method...");
		//throw new RuntimeException();
		throw new TeaRuntime();
	}
	
}
