package com.xworkx.interfaces.app;

import com.xworkx.interfaces.impl.MetroRules;

public class MetroMetroRules implements MetroRules {

	@Override
	public String announcement(char gender) {
		System.out.println("Announcement method implemention in Class....");
		System.out.println("Gender : " + gender);
		return null;
	}

	@Override
	public int timings(int time) {
		System.out.println("Timings method implemention in Class....");
		System.out.println("Time : " + time);
		return 0;
	}

	@Override
	public double payment(double amount) {
		System.out.println("Payment method implemention in Class....");
		System.out.println("Amount : " + amount);
		return 0;
	}

}
