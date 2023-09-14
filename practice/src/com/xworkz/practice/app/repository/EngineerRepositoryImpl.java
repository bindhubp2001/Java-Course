package com.xworkz.practice.app.repository;

import com.xworkz.practice.app.dto.EngineerDTO;

public class EngineerRepositoryImpl implements EngineerRepository {

	private EngineerDTO[] dtos = new EngineerDTO[TOTAL];

	private int position;

	@Override
	public void persist(EngineerDTO dto) {

		if (position < TOTAL) {

			this.dtos[position] = dto;

			System.out.println(dto + " Store at position " + position);

			this.position++;
		}

		else {
			System.out.println("Data Store is Full,,cannot save....");
		}

	}

	@Override
	public boolean isExist(EngineerDTO dto) {

		for (int i = 0; i < position; i++) {

			EngineerDTO dto2 = dtos[i];

			if (dto2.equals(dto)) {
				System.out.println("ALREADY Exist");
				return true;
			}
		}
		return false;
	}

	@Override
	public EngineerDTO findByName(String name) {

		for (int i = 0; i < position; i++) {

			EngineerDTO dto = dtos[i];
			if (dto.getName().equals(name)) {
				System.out.println("DTO FOUND WITH NAME ");
				return dto;
			}
		}

		return null;
	}
	
	@Override
	public EngineerDTO findByClgName(String clgname) {

		for (int i = 0; i < position; i++) {

			EngineerDTO dto = dtos[i];
			if (dto.getClgName().equals(clgname)) {
				System.out.println("DTO FOUND WITH COLLEGE NAME ");
				return dto;
			}
		}

		return null;
	}

	

}
