package com.xworkz.associationmethod.app2;

public class Sport {
	public String name;
	public Player[] players;

	public Sport(String name, Player[] players) {
		this.name = name;
		this.players = players;

	}

	public void printInfo() {
		
		System.out.println("Printing sports info");
		System.out.println("Name :" +name);

		for (int sport = 0; sport < this.players.length; sport++) {
			Player play = players[sport];
			play.printInfo();
		}
	}
}
