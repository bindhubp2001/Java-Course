package com.example.encapsulation.boot;

import com.example.encapsulation.app.Metro;

public class MetroMain {

	public static void main(String[] args) {
		Metro metro = new Metro();
		
		metro.setMetroCity("Bangalore");
		System.out.println(metro.getMetroCity());

		metro.setStartYear(2015);
		System.out.println(metro.getStartYear());

		metro.setPrice(30);
		System.out.println(metro.getPrice());

		metro.setTrainColor("BLUE");
		System.out.println(metro.getTrainColor());

		metro.setWorkers(true);
		System.out.println(metro.isWorkers());

		metro.setOnlinePayment(true);
		System.out.println(metro.isOnlinePayment());

		metro.setTimeSaving(true);
		System.out.println(metro.isTimeSaving());
		
		metro.setName("Bengalore metro");
		System.out.println(metro.getName());

		metro.setLocation("Mejastic");
		System.out.println(metro.getLocation());

		metro.setStartPoint("Vijaynagar");
		System.out.println(metro.getStartPoint());

		metro.setDestinationPoint("Rajajinager");
		System.out.println(metro.getDestinationPoint());

		metro.setOpenTime(7);
		System.out.println(metro.getOpenTime());

		metro.setCloseTime(11);
		System.out.println(metro.getCloseTime());

		metro.setState("Karnataka");
		System.out.println(metro.getState());

		

	}

}
