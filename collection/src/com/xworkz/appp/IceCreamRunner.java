package com.xworkz.appp;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.app.dto.IceCreamDTO;

public class IceCreamRunner {

	public static void main(String[] args) {
		
		IceCreamDTO creamDTO=new IceCreamDTO("Pista", 200.9, "Green", LocalDate.of(2023, 8, 22));
		IceCreamDTO creamDTO1=new IceCreamDTO("Vanilla", 199.9, "White", LocalDate.of(2023, 1, 9));
		IceCreamDTO creamDTO2=new IceCreamDTO("ButterScotch", 78.9, "Yellow", LocalDate.of(2023, 10, 20));
		IceCreamDTO creamDTO3=new IceCreamDTO("Chocolate", 78.9, "Brown", LocalDate.of(2023, 7, 2));
		IceCreamDTO creamDTO4=new IceCreamDTO("Strwaberry", 65.9, "Pink", LocalDate.of(2023, 11, 7));

		
		Comparator<IceCreamDTO> com = (t1,t2) -> t1.getFlavor().compareTo(t2.getFlavor());
		Comparator<IceCreamDTO> com1 = (t1,t2) -> Double.compare(t1.getPrice(), t2.getPrice());
		
		Stream.of(creamDTO,creamDTO1,creamDTO2,creamDTO3,creamDTO4).sorted(com).forEach(f -> System.out.println(f));
		System.out.println("-------------------");
		
		Stream.of(creamDTO,creamDTO1,creamDTO2,creamDTO3,creamDTO4).sorted(com1).forEach(f -> System.out.println(f));
		System.out.println("-------------------");
		
		Comparator<IceCreamDTO> date = (t1,t2) -> t2.getManfactureDate().compareTo(t1.getManfactureDate());
		Stream.of(creamDTO,creamDTO1,creamDTO2,creamDTO3,creamDTO4).sorted(date).forEach(f -> System.out.println(f));

		System.out.println("-------------------");
		Comparator<IceCreamDTO> color = (t1,t2) -> t1.getColor().compareTo(t2.getColor());
		Stream.of(creamDTO,creamDTO1,creamDTO2,creamDTO3,creamDTO4).sorted(color).forEach(f -> System.out.println(f));
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		//Comparator<IceCreamDTO> feilds = com.thenComparing(color);
		//Stream.of(creamDTO,creamDTO1,creamDTO2,creamDTO3,creamDTO4).sorted(com.thencomparing(color).forEach(f -> System.out.println(f));
		
		//Comparator<IceCreamDTO> com1 = (t1,t2) -> Double.compare(t1.getPrice(), t2.getPrice());

		//Comparator<IceCreamDTO> priceAndFlavour = com1.thenComparing((t1,t2) -> t1.getFlavor().compareTo(t2.getFlavor()));
		
 		//Stream.of(creamDTO,creamDTO1,creamDTO2,creamDTO3,creamDTO4).sorted(priceAndFlavour).forEach(f -> System.out.println(f));
		//for (IceCreamDTO iceCreamDTO : collection) {
		//	System.out.println(iceCreamDTO);
		//}
		
		
		
		Comparator<IceCreamDTO> com6 = (t1, t2) -> t1.getPrice().compareTo(t2.getPrice());
		Comparator<IceCreamDTO> priceDateComparator = com6.thenComparing((t1, t2) -> t1.getManfactureDate().compareTo(t2.getManfactureDate()));

		Stream.of(creamDTO, creamDTO1, creamDTO2, creamDTO3, creamDTO4).sorted(priceDateComparator).forEach(i -> System.out.println(i));
		
	}

}
