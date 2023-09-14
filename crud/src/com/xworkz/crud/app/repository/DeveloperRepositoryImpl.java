package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.DeveloperDTO;

public class DeveloperRepositoryImpl implements DeveloperRepository {

	private DeveloperDTO[] dtos = new DeveloperDTO[TOTAL];
	private int position;

	@Override
	public void persist(DeveloperDTO dto) {

		if (position < TOTAL) {
			this.dtos[position] = dto;
			System.out.println(dto + " Store at position : " + this.position);
			this.position++;
		}

		else {
			System.err.println("STORAGE IS FULL CANNOT STORE FURTHER");
		}

	}

	@Override
	public DeveloperDTO findByName(String name) {
		System.out.println("Running findByName in repository..with String arguments");

		for (int index = 0; index < position; index++) {

			DeveloperDTO dto = this.dtos[index];

			if (dto.getName().equals(name)) {
				System.out.println("DTO FOUND WITH NAME : " + name);
				return dto;
			}

		}

		System.out.println("DTO NOT FOUND NAME " + name);
		return DeveloperRepository.super.findByName(name);

	}

	

}
