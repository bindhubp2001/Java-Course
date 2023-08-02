package com.exapmles.inheritence.boot;

import com.exapmles.inheritence.app2.*;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.vehicleMethod();
		System.out.println("----------------------");

		Car car = new Car();
		car.vehicleMethod();
		car.carMethod();
		System.out.println("----------------------");

		Bike bike = new Bike();
		bike.vehicleMethod();
		bike.bikeMethod();
		System.out.println("----------------------");

		Bicycle bicycle = new Bicycle();
		bicycle.vehicleMethod();
		bicycle.bicycleMethod();
		System.out.println("----------------------");

		Airplane airplane = new Airplane();
		airplane.vehicleMethod();
		airplane.airplaneMethod();
		System.out.println("----------------------");

		Ship ship = new Ship();
		ship.vehicleMethod();
		ship.vehicleMethod();
		System.out.println("----------------------");

		Scooty scooty = new Scooty();
		scooty.vehicleMethod();
		scooty.scootyMethod();
		System.out.println("----------------------");

		Auto auto = new Auto();
		auto.autoMethod();
		auto.vehicleMethod();
	}
}
