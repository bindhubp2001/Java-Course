package com.xworkz.appp;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.PlayGroundDTO;

public class PlayGroungRunner {

	public static void main(String[] args) {
		
		PlayGroundDTO dto=new PlayGroundDTO("EdenGarden", 1200.5, "Cricket", 120000);
		PlayGroundDTO dto1=new PlayGroundDTO("Chinnaswamy", 1300.5, "Soccer", 12600);
		PlayGroundDTO dto2=new PlayGroundDTO("Kohli", 1205.5, "BasketBAll", 220000);
		PlayGroundDTO dto3=new PlayGroundDTO("Modi", 1250.5, "Cricket", 1000);
		PlayGroundDTO dto4=new PlayGroundDTO("Kohli", 1205.5, "BasketBAll", 220000);
		PlayGroundDTO dto5=new PlayGroundDTO("EdenGarden", 1200.5, "Cricket", 120000);
		PlayGroundDTO dto6=new PlayGroundDTO("Dharmashala", 1250.5, "Hockey", 260000);

		Collection<PlayGroundDTO> playGroundDTOs =new HashSet<PlayGroundDTO>();
		
		playGroundDTOs.add(dto);
		playGroundDTOs.add(dto1);
		playGroundDTOs.add(dto2);
		playGroundDTOs.add(dto3);
		playGroundDTOs.add(dto4);
		playGroundDTOs.add(dto5);
		playGroundDTOs.add(dto6);
		
		System.out.println("Total Count : "+playGroundDTOs.stream().sorted().count());
		playGroundDTOs.stream().collect(Collectors.toSet()).forEach(n->System.out.println(n));
		
		


	}

}
