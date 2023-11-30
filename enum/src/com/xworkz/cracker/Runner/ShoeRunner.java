package com.xworkz.cracker.Runner;

import com.xworkz.cracker.constants.SizeType;
import com.xworkz.cracker.dto.ShoeDTO;

public class ShoeRunner {

	public static void main(String[] args) {
		
		ShoeDTO dto = new ShoeDTO(SizeType.M);
		dto.setBrand("Puma");
		dto.setCost(3500d);
		System.out.println(dto);
	}
	

}
