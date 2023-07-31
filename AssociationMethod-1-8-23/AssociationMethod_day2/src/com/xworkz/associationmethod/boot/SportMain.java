package com.xworkz.associationmethod.boot;

import com.xworkz.associationmethod.app2.*;


public class SportMain {

	public static void main(String[] args) {
		System.out.println("Rniing MAin in sport Class");

		String name = "CRICKET";

		Floor floor = new Floor("Ground Floor", 0);
		Floor floor1 = new Floor("First Floor", 1);
		Floor floor2 = new Floor("Second Floor", 2);
		Floor floor3 = new Floor("Third Floor", 3);
		Floor floor4 = new Floor("Four Floor", 4);

		Floor[] floors = { floor, floor1, floor2, floor3, floor4};

		Lift lift = new Lift(0);
		Lift lift1 = new Lift(1);
		Lift lift2= new Lift(2);
		Lift lift3= new Lift(3);
		Lift lift4= new Lift(4);

		Lift[] lifts = { lift, lift1,lift2,lift3,lift4};

		Building building = new Building(floors, lifts);
		Building building1 = new Building(floors, lifts);
		Building[] buildings = { building,building1 };

		Corporator corporator = new Corporator("DK Shivkumar", buildings);
		Corporator corporator1 = new Corporator("Tejaswi Surya", buildings);
		Corporator corporator2 = new Corporator("Siddaramaiah", buildings);
		
		Area area = new Area("Malleshwaram", corporator);
		Area area1 = new Area("Mejastic", corporator1);
		Area area2 = new Area("Jaynagar", corporator2);
		Area area3 = new Area("Vijaynagar", corporator1);
		Area area4 = new Area("BTM Layout", corporator2);
		Area[] areas = { area, area1,area2,area3,area4};
		HomeTown town = new HomeTown("Bangalore", 543500, areas);
		
		

		Player player = new Player("MS DHONI", 25, building, town);
		Player player1 = new Player("HARDHIK PANDYA", 35, building, town);
		Player[] players = { player, player1 };

		Sport sport = new Sport(name, players);
		sport.printInfo();

	}
}
