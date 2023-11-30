package com.xworkz.appp;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.CrackerDTO;

public class CrackerRunner {

	public static void main(String[] args) {
		
		CrackerDTO crackerDTO=new CrackerDTO("ATOM", 20, 2000.0, "Green");
		CrackerDTO crackerDTO1=new CrackerDTO("ATOM", 20, 2000.0, "Green");
		CrackerDTO crackerDTO2=new CrackerDTO("Lakshmi", 22, 2700.0, "Red");
		CrackerDTO crackerDTO3=new CrackerDTO("Lakshmi", 22, 2700.0, "Red");
		CrackerDTO crackerDTO4=new CrackerDTO("FlowerPot", 18, 2090.0, "White");
		CrackerDTO crackerDTO5=new CrackerDTO("Rocket", 12, 2300.0, "RedGrenn");
		CrackerDTO crackerDTO6=new CrackerDTO("Shots", 10, 2200.0, "Yellow");
		
		Collection<CrackerDTO> dtos =new HashSet<CrackerDTO>();
		dtos.add(crackerDTO);
		dtos.add(crackerDTO1);
		dtos.add(crackerDTO2);
		dtos.add(crackerDTO3);
		dtos.add(crackerDTO4);
		dtos.add(crackerDTO5);
		dtos.add(crackerDTO6);
		
		System.out.println("Total Count : "+dtos.stream().sorted().count());
		dtos.stream().collect(Collectors.toSet()).forEach(n->System.out.println(n));
		
		

	}

}
