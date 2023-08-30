package com.xworkz.abstraction_interface.impl;

import com.xworkz.abstraction_interface.rules.PassportVerification;

public class PassportVerificationImpl implements PassportVerification {

	@Override
	public void verify() {
		System.out.println("Invoking verify method in Passport Verification Impl.....");

	}

}
