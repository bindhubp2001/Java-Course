package com.xworkz.abstraction_interface.boot;

import com.xworkz.abstraction_interface.impl.Customer;
import com.xworkz.abstraction_interface.impl.PassportVerificationImpl;
import com.xworkz.abstraction_interface.rules.PassportVerification;

public class CustomerMain {

	public static void main(String[] args) {
		PassportVerification passportVerification = new PassportVerificationImpl();

		Customer customer = new Customer();
		customer.setVerification(passportVerification);
		customer.verifyCitizen();
	}

}
