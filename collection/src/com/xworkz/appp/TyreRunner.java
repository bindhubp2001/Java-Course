package com.xworkz.appp;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.TireDTO;

public class TyreRunner {

	public static void main(String[] args) {
		
		TireDTO dto=new TireDTO("CEAT", "Rubber", 20, "Truck");
		TireDTO dto1=new TireDTO("ApolloTyres", "Fibre", 8, "Tractor");
		TireDTO dto2=new TireDTO("Bridgestone", "Fibre", 6, "AirPlane");
		TireDTO dto3=new TireDTO("CEAT", "Rubber", 20, "Truck");
		TireDTO dto4=new TireDTO("MRF", "SynthecticRubber", 10, "Car");
		TireDTO dto5=new TireDTO("MRF", "SynthecticRubber", 10, "Car");
		TireDTO dto6=new TireDTO("FireStone", "Fibre", 4, "Bike");
		
		Collection<TireDTO> tireDTOs = new HashSet<TireDTO>();
		
		tireDTOs.add(dto);
		tireDTOs.add(dto1);
		tireDTOs.add(dto2);
		tireDTOs.add(dto3);
		tireDTOs.add(dto4);
		tireDTOs.add(dto5);
		tireDTOs.add(dto6);
		
		System.out.println("Total count : "+tireDTOs.stream().sorted().count());
		tireDTOs.stream().collect(Collectors.toSet()).forEach(n-> System.out.println(n.getForVehicle()));

		

	}

}
