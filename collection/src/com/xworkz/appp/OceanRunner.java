package com.xworkz.appp;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.app.dto.OceanDTO;

public class OceanRunner {

	public static void main(String[] args) {
		
		OceanDTO dto=new OceanDTO("BlueWhale", 75,98, "Green");
		OceanDTO dto1=new OceanDTO("StarFish", 65,96, "Blue");
		OceanDTO dto2=new OceanDTO("Prawn", 68,82, "Red");
		OceanDTO dto3=new OceanDTO("SeaFish", 37,87, "Gold");
		OceanDTO dto4=new OceanDTO("JellyFish", 99,76, "Green");
		
		Collection<OceanDTO> oceans = new LinkedList<OceanDTO>();
		
		oceans.add(dto);
		oceans.add(dto1);
		oceans.add(dto2);
		oceans.add(dto3);
		oceans.add(dto4);
		
		oceans.stream().sorted().forEach(o -> System.out.println(o));

	}

}
