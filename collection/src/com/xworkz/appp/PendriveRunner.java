package com.xworkz.appp;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.app.dto.PendriveDTO;

public class PendriveRunner {
	
	public static void main(String[] args) {
		
		PendriveDTO pendrive1 = new PendriveDTO("Sandisk", 32, 600, "Red");
		PendriveDTO pendrive2 = new PendriveDTO("HP", 64, 899, "Grey");
		PendriveDTO pendrive3 = new PendriveDTO("Kingston", 256, 799, "Blue");
		PendriveDTO pendrive4 = new PendriveDTO("Stronium Polex", 128, 999, "Black");
		PendriveDTO pendrive5 = new PendriveDTO("Samsung", 16, 1200, "Black");
		
		Collection<PendriveDTO> drives = new LinkedList<PendriveDTO>();
		
		drives.add(pendrive1);
		drives.add(pendrive2);
		drives.add(pendrive3);
		drives.add(pendrive4);
		drives.add(pendrive5);
		
		drives.stream().sorted().forEach(d -> System.out.println(d));
		
	}

}
