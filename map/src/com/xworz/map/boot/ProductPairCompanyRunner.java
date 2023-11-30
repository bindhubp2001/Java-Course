package com.xworz.map.boot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworz.map.dto.CompanyDTO;
import com.xworz.map.dto.ProuctDTO;

public class ProductPairCompanyRunner {

	public static void main(String[] args) {

		ProuctDTO prouctDTO = new ProuctDTO("Shoe", 2000d, 102, 1, LocalDate.of(2023, 1, 1));
		ProuctDTO prouctDTO1 = new ProuctDTO("Cookies", 200d, 101, 5, LocalDate.of(2023, 5, 1));
		ProuctDTO prouctDTO2 = new ProuctDTO("Lays", 40d, 106, 2, LocalDate.of(2023, 1, 11));

		CompanyDTO companyDTO = new CompanyDTO("Puma", "Delhi", "88GHFHGF");
		CompanyDTO companyDTO1 = new CompanyDTO("Oreo", "Hydrabad", "99SGFDSH");
		CompanyDTO companyDTO2 = new CompanyDTO("Bingo", "Banglore", "77ADSDFGF");

		Map<ProuctDTO, CompanyDTO> map = new HashMap<ProuctDTO, CompanyDTO>();
		map.put(prouctDTO, companyDTO);
		map.put(prouctDTO1, companyDTO1);
		map.put(prouctDTO2, companyDTO2);

		Set<ProuctDTO> dtos = map.keySet();
		dtos.forEach(n -> System.out.println(n));

		System.out.println("=============================");

		Collection<CompanyDTO> collection = map.values();
		collection.forEach(m -> System.out.println(m));

		System.out.println("\n=====Printing only product Names : ======");

		Set<ProuctDTO> names = map.keySet();
		names.forEach(n -> System.out.println(n.getName()));

		System.out.println("\n=====Printing only Company Names : ======");

		collection.forEach(n -> System.out.println(n.getName()));

	}

}
