package com.xworkz.appp;

import java.time.LocalDate;

import com.xworkz.app.dto.IceCreamDTO;

public class CloneRunner {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException {

		IceCreamDTO iceCreamDTO = new IceCreamDTO("Pista", 120d, "Green", LocalDate.of(2023, 10, 21));
		System.out.println("iceCreamDTO" + iceCreamDTO);
		// cloning
		IceCreamDTO iceCreamDTO1 = iceCreamDTO.clone();
		System.out.println("iceCreamDTO1" + iceCreamDTO1);

		IceCreamDTO iceCreamDTO2 =  iceCreamDTO.clone();
		iceCreamDTO2.setManfactureDate(LocalDate.of(2023, 10, 22));
		System.out.println("iceCreamDTO2 :" + iceCreamDTO2);

		/*
		 * IceCreamDTO iceCreamDTO3= iceCreamDTO2.getClass().newInstance();
		 * System.out.println("ICeCreamDTO2 :"+iceCreamDTO3);
		 */
		
		System.out.println("*******Shallow Cloning******");
		IceCreamDTO iceCreamDTO3 = new IceCreamDTO("Pista", 120d, "Green", LocalDate.of(2023, 10, 21));
		IceCreamDTO iceCreamDTO4 = iceCreamDTO3;
		
		iceCreamDTO4.setColor("Blue");
		
		System.out.println(iceCreamDTO3);
		System.out.println(iceCreamDTO4);
		
		System.out.println("*******Deep Cloning******");
		IceCreamDTO iceCreamDTO5 = new IceCreamDTO("Pista", 120d, "Green", LocalDate.of(2023, 10, 21));
		IceCreamDTO iceCreamDTO6 = new IceCreamDTO("ButterScotch", 120d, "Green", LocalDate.of(2023, 10, 21));
		
		iceCreamDTO6.setColor("Blue");
		
		System.out.println(iceCreamDTO5);
		System.out.println(iceCreamDTO6);

		


		
	}

}
