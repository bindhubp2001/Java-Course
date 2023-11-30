package com.xworkz.appp;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.FireDTO;

public class FireRunner {

	public static void main(String[] args)  {
		
		FireDTO dto=new FireDTO("Blue", "Large", "Smoking");
		FireDTO dto1=new FireDTO("Organge", "Medium", "FireWork");
		FireDTO dto2=new FireDTO("Red", "Small", "Cooking");
		FireDTO dto3=new FireDTO("Yellow", "Large", "Candle");
		FireDTO dto4=new FireDTO("Blue", "Large", "Smoking");
		FireDTO dto5=new FireDTO("Red", "Small", "Cooking");
		FireDTO dto6=new FireDTO("Green", "Medium", "Smoking");
		
		Collection<FireDTO> fireDTOs=new HashSet<FireDTO>();
		
		fireDTOs.add(dto);
		fireDTOs.add(dto1);
		fireDTOs.add(dto2);
		fireDTOs.add(dto3);
		fireDTOs.add(dto4);
		fireDTOs.add(dto5);
		fireDTOs.add(dto6);
		
		System.out.println("Total count : "+fireDTOs.stream().sorted().count());
		fireDTOs.stream().collect(Collectors.toSet()).forEach(n->System.out.println(n));
		
		FireDTO fire = null;
		try {
			fire = (FireDTO) dto6.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("CloneNotSupportedException...");
		}
		System.out.println(fire);
		
		//FireDTO fire2 = (FireDTO) dto6.clone(); 

		
	}

}
