package com.xworkz.appp;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.HangerDTO;

public class HangerRunner {

	public static void main(String[] args) {

		HangerDTO dto = new HangerDTO("Black", 12, 100, "ToHangCloth");
		HangerDTO dto1 = new HangerDTO("Black", 12, 100, "ToHangCloth");
		HangerDTO dto2 = new HangerDTO("Blue", 24, 200, "ToHangTie");
		HangerDTO dto3 = new HangerDTO("Blue", 24, 200, "ToHangTie");
		HangerDTO dto4 = new HangerDTO("White", 20, 300, "ToHangBelt");
		HangerDTO dto5 = new HangerDTO("Pink", 30, 500, "ToHangTowel");
		HangerDTO dto6 = new HangerDTO("Red", 2, 40, "ToHangSocks");
		
		Collection<HangerDTO> collection=new HashSet<HangerDTO>();
		
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		
		System.out.println("Count : "+collection.stream().sorted().count());
		collection.stream().collect(Collectors.toSet()).forEach(n-> System.out.println(n));
		

	}

}
