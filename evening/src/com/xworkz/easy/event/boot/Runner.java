package com.xworkz.easy.event.boot;

import java.io.FileNotFoundException;

import com.xworkz.easy.event.Fest;

public class Runner {
	public static void main(String[] args) {

		Fest fest = new Fest();

		try {
		
			fest.celebrate();
			Class.forName("com.just.not.work");
		} catch (FileNotFoundException e) {
			System.err.println("Handling here...." + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println("Handling ClassNotFound here...."+e.getMessage());
		}

	}
}
