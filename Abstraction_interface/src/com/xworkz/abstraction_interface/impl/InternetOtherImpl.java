package com.xworkz.abstraction_interface.impl;

import com.xworkz.abstraction_interface.rules.Internet;

public class InternetOtherImpl implements Internet {

	@Override
	public void connect() {
		System.out.println("Calling connect in Internet other implementation Class...");

	}

}
