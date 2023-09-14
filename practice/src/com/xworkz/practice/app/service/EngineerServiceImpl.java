package com.xworkz.practice.app.service;

import com.xworkz.practice.app.dto.EngineerDTO;
import com.xworkz.practice.app.repository.EngineerRepository;

public class EngineerServiceImpl implements EngineerService {

	private EngineerRepository engineerRepository;

	public EngineerServiceImpl(EngineerRepository engineerRepository) {
		this.engineerRepository = engineerRepository;
	}

	@Override
	public boolean validateAndSave(EngineerDTO dto) {

		if (dto != null) {
			System.out.println("DTO is not null");
			int id = dto.getId();
			String name = dto.getName();
			String clgName = dto.getClgName();

			if (id != 0) {
				System.out.println("ID is Valid");
			} else {
				System.out.println("ID is invalid");
				return false;
			}

			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
				System.out.println("NAME is Valid");
			} else {
				System.out.println("NAME is invalid");
				return false;
			}

			if (clgName != null && !clgName.isEmpty() && clgName.length() >= 3 && clgName.length() <= 20) {
				System.out.println("Collage NAME is Valid");
			} else {
				System.out.println("Collage NAME is invalid");
				return false;
			}

			if (!this.engineerRepository.isExist(dto)) {
				this.engineerRepository.persist(dto);
				return true;
			}
		}

		return false;
	}

	@Override
	public EngineerDTO findByName(String name) {

		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
			System.out.println("NAME is Valid,,,,will find");
			EngineerDTO dto = this.engineerRepository.findByName(name);
			return dto;
		} else {
			System.out.println("NAME is invalid");

		}

		return null;
	}

	@Override
	public EngineerDTO findByClgName(String clgname) {

		if (clgname != null && !clgname.isEmpty() && clgname.length() >= 3 && clgname.length() <= 20) {
			System.out.println("COLLEGE NAME is Valid,,,,will find");
			EngineerDTO dto = this.engineerRepository.findByClgName(clgname);
			return dto;
		} else {
			System.out.println("COLLEGE NAME is invalid");

		}

		return null;
	}

}
