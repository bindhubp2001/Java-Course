package com.xworkz.crud_user.repository;

import com.xworkz.crud_user.dto.UserDTO;

public class UserRepositoryImpl implements UserRepository{
	
	private UserDTO[] dtos = new UserDTO[TOTAL];
	private int position;

	@Override
	public void persist(UserDTO dto) {

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
	public UserDTO findByName(String name) {
		System.out.println("Running findByName in repository..with String arguments");

		for (int index = 0; index < position; index++) {

			UserDTO dto = this.dtos[index];

			if (dto.getName().equals(name)) {
				System.out.println("DTO FOUND WITH NAME : " + name);
				return dto;
			}

		}

		System.out.println("DTO NOT FOUND NAME " + name);
		return UserRepository.super.findByName(name);

	}


}
