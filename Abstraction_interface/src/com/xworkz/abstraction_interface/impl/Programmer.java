package com.xworkz.abstraction_interface.impl;

import com.xworkz.abstraction_interface.rules.Computer;

public class Programmer {
	private Computer computer;
	
	public void operate() {
		System.out.println("calling method in Programmer Class ......");
		this.computer.information();
	}
	
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
}
