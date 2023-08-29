package com.xworkz.association.boot;

import com.xworkz.association.app.Bus;
import com.xworkz.association.app.Passenger;

public class BusMain {

	public static void main(String[] args) {
		String type = "KSRTC";

		Passenger passenger = new Passenger();

		Bus bus = new Bus(type);
		bus.setPassenger(passenger);
		bus.drive();
	}

}
