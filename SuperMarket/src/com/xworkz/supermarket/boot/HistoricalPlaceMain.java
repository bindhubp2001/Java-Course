package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.HistoricalPlace;
import com.xworkz.supermarket.app.repositoryImpl.HisoricalPlaceImpl;

public class HistoricalPlaceMain {

	public static void main(String[] args) {
	HistoricalPlace historicalPlace=new HisoricalPlaceImpl();
	
	historicalPlace.save("Hampi");
	historicalPlace.save("AJanta");
	historicalPlace.save("Ellora");
	historicalPlace.save("Belur");
	historicalPlace.save("Halebidu");
	historicalPlace.save("Mysore Palacce");
	historicalPlace.save("Mysore Church");
	historicalPlace.save("LalithaMahal");
	historicalPlace.save("Badami");
	historicalPlace.save("Badami");
	historicalPlace.save("Shivamoga");
	}

}
