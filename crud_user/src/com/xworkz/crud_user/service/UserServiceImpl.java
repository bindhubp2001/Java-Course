package com.xworkz.crud_user.service;


import com.xworkz.crud_user.dto.UserDTO;
import com.xworkz.crud_user.repository.UserRepository;

public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public boolean validateAndSave(UserDTO dto) {

		if (dto != null) {
			System.out.println("DTO is NOT NULL");

			String name = dto.getName();
			int experience = dto.getAge();
			double salary = dto.getSalary();
			String company = dto.getCompany();
			String workingRole = dto.getWorkingRole();
			String location = dto.getLocation();
			String state=dto.getState();
			String country=dto.getCountry();

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

			if (company != null && !company.isEmpty() && company.length() >= 3 && company.length() <= 20) {
				System.out.println("COMAPNY IS VALID....");

			} else {
				System.out.println("COMPANY IS INVALID....");
				return false;
			}

			if (workingRole != null && !workingRole.isEmpty() && workingRole.length() >= 3
					&& workingRole.length() <= 20) {
				System.out.println("workingRole IS VALID....");

			} else {
				System.out.println("workingRole IS INVALID....");
				return false;
			}
			
			if (location != null && !location.isEmpty() && location.length() >= 3 && location.length() <= 20) {
				System.out.println("location IS VALID....");

			} else {
				System.out.println("location IS INVALID....");
				return false;
			}
			
			if (state != null && !state.isEmpty() && state.length() >= 3 && state.length() <= 20) {
				System.out.println("State IS VALID....");

			} else {
				System.out.println("State IS INVALID....");
				return false;
			}

			this.userRepository.persist(dto);
			return true;
		}
		System.err.println("DTO IS NULL CANNOT VALIDATE ");

		return false;
	}

	@Override
	public UserDTO findByName(String name) {
		System.out.println("Running findByPublisher service ,  String arg passed " + name);

		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
			System.out.println("NAME IS VALID....WILL FIND");

			UserDTO dto = this.userRepository.findByName(name);
			return dto;

		} else {
			System.out.println("NAME IS INVALID....");

		}
		return UserService.super.findByName(name);
	}


}
