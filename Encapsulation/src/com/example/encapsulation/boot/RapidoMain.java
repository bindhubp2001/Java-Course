package com.example.encapsulation.boot;

import com.example.encapsulation.app.Rapido;

public class RapidoMain {

	public static void main(String[] args) {
		Rapido rapido = new Rapido();

		rapido.setCustomerName("Shree");
		System.out.println(rapido.getCustomerName());

		rapido.setValidOTP(true);
		System.out.println(rapido.isValidOTP());

		rapido.setOnlinePayment(true);
		System.out.println(rapido.isOnlinePayment());

		rapido.setCashPayment(true);
		System.out.println(rapido.isCashPayment());

		rapido.setAvailableAnyTime(true);
		System.out.println(rapido.isAvailableAnyTime());

		rapido.setTwoWheeler(true);
		System.out.println(rapido.isTwoWheeler());

		rapido.setSourceAddress("Marthalli");
		System.out.println(rapido.getSourceAddress());

		rapido.setDestinationAddress("Vijaynagar");
		System.out.println(rapido.getDestinationAddress());

		rapido.setHeadQuaters("Bangalore");
		System.out.println(rapido.getHeadQuaters());

		rapido.setFounder("Aravind Sanka");
		System.out.println(rapido.getFounder());

		rapido.setStartYear(2019);
		System.out.println(rapido.getStartYear());

		rapido.setCeo("Aravind Sanka");
		System.out.println(rapido.getCeo());

		rapido.setBookRide(true);
		System.out.println(rapido.isBookRide());

		rapido.setDriverName("Rhagav");
		System.out.println(rapido.getDriverName());

	}

}
