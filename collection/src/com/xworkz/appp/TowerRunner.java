package com.xworkz.appp;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.app.dto.TowerDTO;

public class TowerRunner {
	
	public static void main(String[] args) {
		TowerDTO dto=new TowerDTO("Bhurj Kalifa", 828, 100, "Dubai");
		TowerDTO dto1=new TowerDTO("Shanghai Tower", 632, 200, "China");
		TowerDTO dto2=new TowerDTO("Lotte World Tower", 555, 150, "SouthKorea");
		TowerDTO dto3=new TowerDTO("Abraj Al Bait Towers", 601, 150, "Mecca");
		TowerDTO dto4=new TowerDTO("Ping An Finance Center", 599, 260, "China");
		
		Collection<TowerDTO> towers = new LinkedList<TowerDTO>();
		
		towers.add(dto);
		towers.add(dto1);
		towers.add(dto2);
		towers.add(dto3);
		towers.add(dto4);
		
		towers.stream().sorted().forEach(tower-> System.out.println(tower));
		
		
	}

}
