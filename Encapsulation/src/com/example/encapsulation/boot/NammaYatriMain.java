package com.example.encapsulation.boot;

import com.example.encapsulation.app.NammaYatri;

public class NammaYatriMain {

	public static void main(String[] args) {
		
		NammaYatri yatri = new NammaYatri();
		
		yatri.setSourceAddress("Chandra Layout");
		System.out.println(yatri.getSourceAddress());

		yatri.setDestinationAddress("Yeshwanthpur");
		System.out.println(yatri.getDestinationAddress());

		yatri.setAvailableAnyTime(true);
		System.out.println(yatri.isAvailableAnyTime());

		yatri.setAuto(true);
		System.out.println(yatri.isAuto());

		yatri.setAppVailable(true);
		System.out.println(yatri.isAppVailable());

		yatri.setFounder("Vimal Kumar");
		System.out.println(yatri.getFounder());

		yatri.setStartYear(2022);
		System.out.println(yatri.getStartYear());

		yatri.setBookRide(true);
		System.out.println(yatri.isBookRide());
		
		yatri.setDriverName("Vijay");
		System.out.println(yatri.getDriverName());

		yatri.setCustomerName("Sampreeth");
		System.out.println(yatri.getCustomerName());

		yatri.setValidOTP(false);
		System.out.println(yatri.isValidOTP());

		yatri.setOnlinePayment(true);
		System.out.println(yatri.isOnlinePayment());

		yatri.setCashPayment(true);
		System.out.println(yatri.isCashPayment());

		
	}

}
