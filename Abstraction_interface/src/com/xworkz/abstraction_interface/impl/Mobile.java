package com.xworkz.abstraction_interface.impl;

import com.xworkz.abstraction_interface.rules.Bluetooth;

public class Mobile implements Bluetooth {

	@Override
	public void wirelessConnect() {
		System.out.println("Calling method in Mobile Class (IMplementation)....");
	}

}
