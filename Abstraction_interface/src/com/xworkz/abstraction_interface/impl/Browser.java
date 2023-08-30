package com.xworkz.abstraction_interface.impl;

import com.xworkz.abstraction_interface.rules.Internet;

public class Browser {
	private Internet internet;

	public void connect() {
		System.out.println("Calling connect method from Browser Class...");
		this.internet.connect();
	}

	public void setInternet(Internet internet) {
		this.internet = internet;
	}
}
