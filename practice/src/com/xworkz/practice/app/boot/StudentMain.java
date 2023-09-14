package com.xworkz.practice.app.boot;

import com.xworkz.practice.app.dto.StudentDTO;
import com.xworkz.practice.app.repository.StudentRepository;
import com.xworkz.practice.app.repository.StudentRepositoryImpl;
import com.xworkz.practice.app.service.StudentService;
import com.xworkz.practice.app.service.StudentServiceImpl;

public class StudentMain {

	public static void main(String[] args) {

		StudentRepository repository = new StudentRepositoryImpl();
		StudentService service = new StudentServiceImpl(repository);
		StudentDTO dto = new StudentDTO(1, "Bindhu", "4ub19cs010", "CSE", "CHITADURGA", "UBDT", "DVG", 577501, 384756,
				9, 8, 2019, 1023, false, true, true, 7500, "ubdt hostel", "vidyanagar", 35000, 2023, 18000, 999, 82,
				false);
		StudentDTO dto1 = new StudentDTO(1, "Bindhu", "4ub19cs010", "CSE", "CHITADURGA", "gmit", "DVG", 577501, 384756,
				9, 8, 2019, 1023, false, true, true, 7500, "ubdt hostel", "vidyanagar", 35000, 2023, 18000, 999, 82,
				false);

		service.validateAndSave(dto);
		service.validateAndSave(dto1);

		System.out.println("-----------------");

		StudentDTO dto2 = service.findByName("Bindhu");
		System.out.println("FOUND Name is " + dto2.getName());

		System.out.println("-----------------");

		StudentDTO dto3 = service.findByUSN("4ub19cs010");
		System.out.println("FOUND Name is " + dto3.getUsn());

		System.out.println("-----------------");

		StudentDTO dto4 = service.findByClgName("gmit");
		System.out.println("FOUND Name is " + dto4.getClgName());

		System.out.println("-----------------");

		StudentDTO dto5 = service.findById(1);
		System.out.println("FOUND Name is " + dto5.getId());

	}

}
