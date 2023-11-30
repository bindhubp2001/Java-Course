package com.xworkz.appp;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.BridgeDTO;

public class BridgeRunner {

	public static void main(String[] args) {
		
		BridgeDTO bridgeDTO=new BridgeDTO(22.8, 40.2, "Golden Gate Bridge", "San Francisco");
		BridgeDTO bridgeDTO1=new BridgeDTO(22.8, 40.2, "Golden Gate Bridge", "San Francisco");
		BridgeDTO bridgeDTO2=new BridgeDTO(21.8, 30.2, "Brooklyn Bridge", "New York");
		BridgeDTO bridgeDTO3=new BridgeDTO(21.8, 30.2, "Brooklyn Bridge", "New York");
		BridgeDTO bridgeDTO4=new BridgeDTO(32.8, 90.2, "Tower Bridge", "London");
		BridgeDTO bridgeDTO5=new BridgeDTO(50.8, 33.2, "Sydney Harbour Bridge", "Sydney");
		BridgeDTO bridgeDTO6=new BridgeDTO(122.8, 100.2, "Charles Bridge", "Prague");
		
		Collection<BridgeDTO> dtos = new HashSet<BridgeDTO>();
		
		dtos.add(bridgeDTO);
		dtos.add(bridgeDTO1);
		dtos.add(bridgeDTO2);
		dtos.add(bridgeDTO3);
		dtos.add(bridgeDTO4);
		dtos.add(bridgeDTO5);
		dtos.add(bridgeDTO6);
		
		System.out.println("Count : "+dtos.stream().sorted().count());
		dtos.stream().collect(Collectors.toSet()).forEach(n-> System.out.println(n.getName()));

	}

}
