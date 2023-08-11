package com.example.encapsulation.boot;

import com.example.encapsulation.app.Uber;

public class UberMain {

	public static void main(String[] args) {
		Uber uber = new Uber();
		uber.setHeadQuaters("San Francisco");
		System.out.println(uber.getHeadQuaters());

		uber.setFounder("Travis Kalanick");
		System.out.println(uber.getFounder());

		uber.setStartYear(2009);
		System.out.println(uber.getStartYear());

		uber.setCeo("Dara Khosrowshahi");
		System.out.println(uber.getCeo());

		uber.setCfo("Nelson Chai");
		System.out.println(uber.getCfo());

		uber.setBookRide(true);
		System.out.println(uber.isBookRide());

		uber.setBookRide(true);
		System.out.println(uber.isBookRide());

		uber.setValidOTP(false);
		System.out.println(uber.isValidOTP());

		uber.setOnlinePayment(true);
		System.out.println(uber.isOnlinePayment());

		uber.setCashPayment(false);
		System.out.println(uber.isCashPayment());

		uber.setAvailableAnyTime(true);
		System.out.println(uber.isAvailableAnyTime());

		uber.setDriverName("Vijay");
		System.out.println(uber.getDriverName());

		uber.setCustomerName("Ajay");
		System.out.println(uber.getCustomerName());

		uber.setSourceAddress("Ramnagar");
		System.out.println(uber.getSourceAddress());

		uber.setDestinationAddress("WhiteField");
		System.out.println(uber.getDestinationAddress());

	}

}
