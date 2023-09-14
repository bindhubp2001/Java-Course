package com.xworkz.crud.app.service;

import com.xworkz.crud.app.dto.DeveloperDTO;
import com.xworkz.crud.app.repository.DeveloperRepository;

public class DeveloperServiceImpl implements DeveloperService {

	private DeveloperRepository developerRepository;

	public DeveloperServiceImpl(DeveloperRepository developerRepository) {
		this.developerRepository = developerRepository;
	}

	@Override
	public boolean validateAndSave(DeveloperDTO dto) {

		if (dto != null) {
			System.out.println("DTO is NOT NULL");

			String name = dto.getName();
			int experience = dto.getExperience();
			double salary = dto.getSalary();
			String workFor = dto.getWorkingFor();
			String designation = dto.getDesignation();

			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
				System.out.println("NAME IS VALID...");

			} else {
				System.out.println("NAME IS INVALID....");
				return false;
			}

			if (experience != 0) {
				System.out.println("Experince IS VALID....");

			} else {
				System.out.println("Experince IS INVALID....");
				return false;
			}

			if (salary != 0) {
				System.out.println("SALARY IS VALID....");

			} else {
				System.out.println("SALARY IS INVALID....");
				return false;
			}

			if (workFor != null && !workFor.isEmpty() && workFor.length() >= 3 && workFor.length() <= 20) {
				System.out.println("WORKFOR IS VALID....");

			} else {
				System.out.println("WORKFOR IS INVALID....");
				return false;
			}

			if (designation != null && !designation.isEmpty() && designation.length() >= 3
					&& designation.length() <= 20) {
				System.out.println("DESIGNATION IS VALID....");

			} else {
				System.out.println("DESIGNATION IS INVALID....");
				return false;
			}

			this.developerRepository.persist(dto);
			return true;
		}
		System.err.println("DTO IS NULL CANNOT VALIDATE ");

		return false;
	}

	@Override
	public DeveloperDTO findByName(String name) {
		System.out.println("Running findByPublisher service ,  String arg passed " + name);

		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
			System.out.println("NAME IS VALID....WILL FIND");

			DeveloperDTO dto = this.developerRepository.findByName(name);
			return dto;

		} else {
			System.out.println("NAME IS INVALID....");

		}
		return DeveloperService.super.findByName(name);
	}

//	@Override
//	public DeveloperDTO findByWorkingFor(String c_name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public DeveloperDTO findByNameAndWorkingFor(String name, String c_name) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
