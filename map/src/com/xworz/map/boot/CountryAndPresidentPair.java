package com.xworz.map.boot;

import java.sql.Connection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.xworz.map.dto.CountryDTO;
import com.xworz.map.dto.PresidentDTO;

public class CountryAndPresidentPair {

	public static void main(String[] args) {

	CountryDTO countryDTO1=new CountryDTO(1, "India");
	CountryDTO countryDTO2=new CountryDTO(2, "USA");
	CountryDTO countryDTO3=new CountryDTO(3, "Russia");
	CountryDTO countryDTO4=new CountryDTO(4, "China");
	CountryDTO countryDTO5=new CountryDTO(5, "Italy");
	
	PresidentDTO dto1=new PresidentDTO(1, "Draupadi Murmu");
	PresidentDTO dto2=new PresidentDTO(1, "Obama");
	PresidentDTO dto3=new PresidentDTO(1, "Putin");
	PresidentDTO dto4=new PresidentDTO(1, "Leminho");
	PresidentDTO dto5=new PresidentDTO(1, "Meloni");
	
	Map<CountryDTO, PresidentDTO> countryAndPresident=new HashMap<CountryDTO, PresidentDTO>();
	countryAndPresident.put(countryDTO1, dto1);
	countryAndPresident.put(countryDTO2, dto2);
	countryAndPresident.put(countryDTO3, dto3);
	countryAndPresident.put(countryDTO4, dto4);
	countryAndPresident.put(countryDTO5, dto5);
	
	System.out.println("-------Printing only keys------\n");
	
	Set<CountryDTO> keys= countryAndPresident.keySet();
	keys.forEach(k->System.out.println(k));
	
	System.out.println("\n-------Printing only Values------\n");
	
	Collection<PresidentDTO> values= countryAndPresident.values();
	values.forEach(v->System.out.println(v));
	
	System.out.println("\n--------------------------\n");
	
	Set<Entry<CountryDTO, PresidentDTO>> entries= countryAndPresident.entrySet();
	entries.forEach(e-> System.out.println(e));
	
	System.out.println("\n-------------------------\n");
	
	countryAndPresident.forEach((k,v) -> System.out.println(k+"     "+v));
	
	System.out.println("\n-------sorting country--------\n");
	
	

	
	}

}
