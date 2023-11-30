package com.xworkz.appp;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.PinDTO;

public class PinRunner {

	public static void main(String[] args) {
		
		PinDTO dto=new PinDTO("Steel", 10, 20, "Rectangle");
		PinDTO dto1=new PinDTO("Steel", 10, 20, "Rectangle");
		PinDTO dto2=new PinDTO("Iron", 20, 40, "Square");
		PinDTO dto3=new PinDTO("Iron", 20, 40, "Square");
		PinDTO dto4=new PinDTO("Rubber", 80, 160, "Circle");
		PinDTO dto5=new PinDTO("Gold", 5, 10, "Sphere");
		PinDTO dto6=new PinDTO("Copper", 15, 30, "Cyclinder");
		
		Collection<PinDTO> collection=new HashSet<PinDTO>();
		
		collection.add(dto6);
		collection.add(dto5);
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		collection.add(dto);
		
		System.out.println("Count : "+collection.stream().sorted().count());
		collection.stream().collect(Collectors.toSet()).forEach(i-> System.out.println(i));
		

	}

}
