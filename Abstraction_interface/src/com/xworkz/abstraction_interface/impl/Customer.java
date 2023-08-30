package com.xworkz.abstraction_interface.impl;

import com.xworkz.abstraction_interface.rules.PassportVerification;

public class Customer {
	private PassportVerification verification;

	public void verifyCitizen() {
		System.out.println("Verify Citizen method in Customer Class...");
		this.verification.verify();
	}

	public void setVerification(PassportVerification verification) {
		this.verification = verification;
	}
}
