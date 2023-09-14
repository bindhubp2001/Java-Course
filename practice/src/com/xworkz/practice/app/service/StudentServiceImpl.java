package com.xworkz.practice.app.service;

import com.xworkz.practice.app.dto.StudentDTO;
import com.xworkz.practice.app.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {

	private StudentRepository repository;

	public StudentServiceImpl(StudentRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(StudentDTO dto) {

		if (dto != null) {
			System.out.println("DTO NOT EQUAL TO NULL...");
			int id = dto.getId();
			String name = dto.getName();
			String clgName = dto.getClgName();
			String usn = dto.getUsn();
			String location = dto.getClgLocation();
			String clgLocation = dto.getClgLocation();
			int pincode = dto.getPinocde();
			int clgCode = dto.getClgCode();
			float sgpa = dto.getSgpa();
			float cgpa = dto.getCgpa();
			int startYear = dto.getStartYear();
			int endYear = dto.getEndYear();
			double fee = dto.getFee();
			String hostelName = dto.getHostelName();
			String hostelLocation = dto.getHostelLocation();
			double hostelFee = dto.getHostelFee();
			int passedYear = dto.getPassedYear();
			double scholerShip = dto.getScholerShip();
			int totalMarks = dto.getTotalMarks();
			float totalPercentage = dto.getTotalPercentage();

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
			if (usn != null && !usn.isEmpty() && usn.length() == 10) {
				System.out.println("USN is Valid");
			} else {
				System.out.println("USN is invalid");
				return false;
			}

			if (location != null && !location.isEmpty() && location.length() >= 3 && location.length() <= 20) {
				System.out.println("LOCATION is Valid");
			} else {
				System.out.println("LOCATION is invalid");
				return false;
			}

			if (clgName != null && !clgName.isEmpty() && clgName.length() >= 3 && clgName.length() <= 20) {
				System.out.println("Collage NAME is Valid");
			} else {
				System.out.println("Collage NAME is invalid");
				return false;
			}

			if (clgLocation != null && !clgLocation.isEmpty() && clgLocation.length() >= 3
					&& clgLocation.length() <= 20) {
				System.out.println("clgLocation is Valid");
			} else {
				System.out.println("clgLocation is invalid");
				return false;
			}

			if (pincode != 0) {
				System.out.println("pincode is Valid");
			} else {
				System.out.println("pincode is invalid");
				return false;
			}

			if (clgCode != 0) {
				System.out.println("clgcode is Valid");
			} else {
				System.out.println("clgcode is invalid");
				return false;
			}

			if (sgpa != 0) {
				System.out.println("sgpa is Valid");
			} else {
				System.out.println("sgpa is invalid");
				return false;
			}

			if (cgpa != 0) {
				System.out.println("cgpa is Valid");
			} else {
				System.out.println("cgpa is invalid");
				return false;
			}

			if (startYear != 0) {
				System.out.println("startyear is Valid");
			} else {
				System.out.println("startyear is invalid");
				return false;
			}

			if (endYear != 0) {
				System.out.println("endyear is valid");
			} else {
				System.out.println("endyear is invalid");
				return false;
			}

			if (fee != 0) {
				System.out.println("fee is Valid");
			} else {
				System.out.println("fee is invalid");
				return false;
			}

			if (hostelName != null && !hostelName.isEmpty() && hostelName.length() >= 3 && hostelName.length() <= 20) {
				System.out.println("hostelName is Valid");
			} else {
				System.out.println("hostelName is invalid");
				return false;
			}

			if (hostelLocation != null && !hostelLocation.isEmpty() && hostelLocation.length() >= 3
					&& hostelLocation.length() <= 20) {
				System.out.println("hostelLocation is Valid");
			} else {
				System.out.println("hostelLocation is invalid");
				return false;
			}

			if (hostelFee != 0) {
				System.out.println("hostel fee is Valid");
			} else {
				System.out.println("hostel fee is invalid");
				return false;
			}

			if (passedYear != 0) {
				System.out.println("passedYear is Valid");
			} else {
				System.out.println("passedYear is invalid");
				return false;
			}

			if (scholerShip != 0) {
				System.out.println("scholerShip is Valid");
			} else {
				System.out.println("scholerShip is invalid");
				return false;
			}

			if (totalMarks != 0) {
				System.out.println("marks is Valid");
			} else {
				System.out.println("marks is invalid");
				return false;
			}

			if (totalPercentage != 0) {
				System.out.println("percentage is Valid");
			} else {
				System.out.println("percenatge is invalid");
				return false;
			}

			if (!this.repository.isExist(dto)) {
				this.repository.save(dto);
				return true;
			}

		}
		return false;

	}

	@Override
	public StudentDTO findByName(String name) {

		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
			System.out.println("NAME is Valid..will Find");
			StudentDTO dto = this.repository.findByName(name);
			return dto;

		} else {
			System.err.println("NAME is invalid");

		}

		return null;

	}

	@Override
	public StudentDTO findByUSN(String usn) {

		if (usn != null && !usn.isEmpty() && usn.length() >= 3 && usn.length() <= 20) {
			System.out.println("USN is Valid..will Find");
			StudentDTO dto = this.repository.findByUSN(usn);
			return dto;

		} else {
			System.err.println("USN is invalid");

		}

		return null;
	}

	@Override
	public StudentDTO findByClgName(String clgName) {

		if (clgName != null && !clgName.isEmpty() && clgName.length() >= 3 && clgName.length() <= 20) {
			System.out.println("CLGNAME is Valid..will Find");
			StudentDTO dto = this.repository.findByClgName(clgName);
			return dto;

		} else {
			System.err.println("CLGNAME  is invalid");

		}

		return null;
	}

	@Override
	public StudentDTO findByBranch(String branch) {

		if (branch != null && !branch.isEmpty() && branch.length() >= 3 && branch.length() <= 20) {
			System.out.println("BRANCH is Valid..will Find");
			StudentDTO dto = this.repository.findByBranch(branch);
			return dto;

		} else {
			System.err.println("BRANCH  is invalid");

		}

		return null;
	}

	@Override
	public StudentDTO findById(int id) {

		if (id != 0) {
			System.out.println("ID is Valid..will Find");
			StudentDTO dto = this.repository.findById(id);
			return dto;

		} else {
			System.err.println("ID  is invalid");

		}

		return null;
	}

}
