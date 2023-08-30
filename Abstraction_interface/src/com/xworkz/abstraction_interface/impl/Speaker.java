package com.xworkz.abstraction_interface.impl;

import com.xworkz.abstraction_interface.rules.Bluetooth;

public class Speaker {
	private Bluetooth bluetooth;
	
	public void wirelessConnect() {
		System.out.println("Calling method method in Speaker Class.....");
		this.bluetooth.wirelessConnect();
	}
	
	public void setBluetooth(Bluetooth bluetooth) {
		this.bluetooth = bluetooth;
	}
}
