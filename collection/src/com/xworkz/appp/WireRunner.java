package com.xworkz.appp;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.WireDTO;

public class WireRunner {

	public static void main(String[] args) {

		WireDTO dto = new WireDTO(22.8, 23.1, "Copper", "Current");
		WireDTO dto1 = new WireDTO(22.8, 23.1, "Copper", "Current");
		WireDTO dto2 = new WireDTO(2.8, 3.1, "Rubber", "Switch");
		WireDTO dto3 = new WireDTO(20.8, 20.1, "Alluminium", "Current");
		WireDTO dto4 = new WireDTO(21.8, 21.1, "Magnet", "Cable");
		WireDTO dto5 = new WireDTO(23.8, 23.1, "Steel", "Current");
		WireDTO dto6 = new WireDTO(23.8, 23.1, "Steel", "Current");

		Collection<WireDTO> wireDTOs = new HashSet<WireDTO>();
		
		wireDTOs.add(dto);
		wireDTOs.add(dto1);
		wireDTOs.add(dto2);
		wireDTOs.add(dto3);
		wireDTOs.add(dto4);
		wireDTOs.add(dto5);
		wireDTOs.add(dto6);
		
		System.out.println("Total Count : "+wireDTOs.stream().sorted().count());
		wireDTOs.stream().collect(Collectors.toSet()).forEach(n-> System.out.println(n.getMaterial()));
		
		
				
		

	}

}
