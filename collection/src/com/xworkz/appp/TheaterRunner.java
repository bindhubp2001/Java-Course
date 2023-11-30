package com.xworkz.appp;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.app.dto.TheaterDTO;

public class TheaterRunner {

	public static void main(String[] args) {
		
		TheaterDTO theater1=new TheaterDTO("PVR", 50000, "DareDevil Mustafa", 1500);
		TheaterDTO theater2=new TheaterDTO("Raj", 3000, "RanaRangam", 300);
		TheaterDTO theater3=new TheaterDTO("Lulu", 800, "Taj", 200);
		TheaterDTO theater4=new TheaterDTO("Orion", 100000, "Robot", 199);
		TheaterDTO theater5=new TheaterDTO("Manasa", 500, "InterSteller", 200);
		
		Collection<TheaterDTO> theaters = new LinkedList<TheaterDTO>();
		
		theaters.add(theater1);
		theaters.add(theater2);
		theaters.add(theater3);
		theaters.add(theater4);
		theaters.add(theater5);
		
		theaters.stream().sorted().forEach(t -> System.out.println(t));;

	}

}
