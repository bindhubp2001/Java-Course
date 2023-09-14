package com.xworkz.practice.app.repository;

import com.xworkz.practice.app.dto.StudentDTO;

public class StudentRepositoryImpl implements StudentRepository {

	private StudentDTO[] dtos = new StudentDTO[TOTAL_STUDENT];

	private int position;

	@Override
	public void save(StudentDTO dto) {

		if (position < TOTAL_STUDENT) {
			this.dtos[position] = dto;

			System.out.println(dto + " Store at position " + this.position);
			this.position++;
		} else {
			System.out.println("DS id FUll CANNOT STORE FURTHER.....");
		}

	}

	@Override
	public boolean isExist(StudentDTO dto) {

		for (int i = 0; i < position; i++) {
			StudentDTO dto2 = this.dtos[i];

			if (dto2.equals(dto)) {
				System.out.println("Already EXIST");
				return true;
			}
		}

		return false;
	}

	@Override
	public StudentDTO findByName(String name) {

		for (int i = 0; i < position; i++) {
			StudentDTO temp = this.dtos[i];

			if (temp.getName().equals(name)) {
				System.out.println("DTO FOUND WITH NAME ");
				return temp;
			}
		}

		return null;
	}

	@Override
	public StudentDTO findByUSN(String usn) {

		for (int i = 0; i < position; i++) {
			StudentDTO temp = this.dtos[i];

			if (temp.getUsn().equals(usn)) {
				System.out.println("DTO FOUND WITH USN ");
				return temp;
			}
		}

		return null;
	}

	@Override
	public StudentDTO findByClgName(String clgName) {

		for (int i = 0; i < position; i++) {
			StudentDTO temp = this.dtos[i];

			if (temp.getClgName().equals(clgName)) {
				System.out.println("DTO FOUND WITH COLLAGE NAME ");
				return temp;
			}
		}

		return null;
	}

	@Override
	public StudentDTO findByBranch(String branch) {

		for (int i = 0; i < position; i++) {
			StudentDTO temp = this.dtos[i];

			if (temp.getBranch().equals(branch)) {
				System.out.println("DTO FOUND WITH BRANCH NAME ");
				return temp;
			}
		}

		return null;
	}

	@Override
	public StudentDTO findById(int id) {

		for (int i = 0; i < position; i++) {
			StudentDTO temp = this.dtos[i];

			if (temp.getId() == (id)) {
				System.out.println("DTO FOUND WITH ID ");
				return temp;
			}
		}

		return null;
	}

}
