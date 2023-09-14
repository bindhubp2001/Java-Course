package com.xworkz.practice.app.boot;

import com.xworkz.practice.app.dto.EngineerDTO;
import com.xworkz.practice.app.repository.EngineerRepository;
import com.xworkz.practice.app.repository.EngineerRepositoryImpl;
import com.xworkz.practice.app.service.EngineerService;
import com.xworkz.practice.app.service.EngineerServiceImpl;

public class EngineerMain {

	public static void main(String[] args) {

		EngineerRepository engineerRepository = new EngineerRepositoryImpl();

		EngineerService engineerService = new EngineerServiceImpl(engineerRepository);

		EngineerDTO engineerDTO = new EngineerDTO(1, "Bindhu", "UBDT");

		engineerService.validateAndSave(engineerDTO);

		System.out.println();

		EngineerDTO engineerDTO1 = new EngineerDTO(1, "Bindhu", "UBDT");

		engineerService.validateAndSave(engineerDTO1);

		System.out.println();

		EngineerDTO dto = engineerService.findByName("Bindhu");
		System.out.println("FOUND Name is " + dto.getName());

		System.out.println();

		EngineerDTO dto1 = engineerService.findByClgName("UBDT");
		System.out.println("FOUND COllege Name is " + dto1.getClgName());

		System.out.println();

		EngineerDTO engineerDTO2 = new EngineerDTO(10, "SHREE", "UBDT");

		engineerService.validateAndSave(engineerDTO2);

	}

}
