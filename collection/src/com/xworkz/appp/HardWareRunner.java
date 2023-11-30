package com.xworkz.appp;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.HardWareSDTO;

public class HardWareRunner {

	public static void main(String[] args) {
		
		HardWareSDTO hardWareSDTO=new HardWareSDTO("SSD", 1200, "Storage", 2);
		HardWareSDTO hardWareSDTO1=new HardWareSDTO("SSD", 1200, "Storage", 2);
		HardWareSDTO hardWareSDTO2=new HardWareSDTO("CPU", 1500, "Memory", 5);
		HardWareSDTO hardWareSDTO3=new HardWareSDTO("CPU", 1500, "Memory", 5);
		HardWareSDTO hardWareSDTO4=new HardWareSDTO("HardDrive", 1100, "Storage", 1);
		HardWareSDTO hardWareSDTO5=new HardWareSDTO("MotherBoard", 900, "Storage", 1);
		HardWareSDTO hardWareSDTO6=new HardWareSDTO("RAM", 700, "Memory", 3);
		
		Collection<HardWareSDTO> collection=new HashSet<HardWareSDTO>();
		
		collection.add(hardWareSDTO6);
		collection.add(hardWareSDTO5);
		collection.add(hardWareSDTO4);
		collection.add(hardWareSDTO3);
		collection.add(hardWareSDTO2);
		collection.add(hardWareSDTO1);
		collection.add(hardWareSDTO);
		
		System.out.println(collection.stream().sorted().count());
		collection.stream().collect(Collectors.toSet()).forEach(n-> System.out.println(n));



	}

}
