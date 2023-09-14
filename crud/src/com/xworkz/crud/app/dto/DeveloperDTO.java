package com.xworkz.crud.app.dto;

import java.io.Serializable;

public class DeveloperDTO implements Serializable {

	private String name;
	private int experience;
	private double salary;
	private String workingFor;
	private String designation;
	private boolean isDifficult;

	public DeveloperDTO() {

	}

	public DeveloperDTO(String name, int experience, double salary, String workingFor, String designation,
			boolean isDifficult) {
		super();
		this.name = name;
		this.experience = experience;
		this.salary = salary;
		this.workingFor = workingFor;
		this.designation = designation;
		this.isDifficult = isDifficult;
	}

	@Override
	public String toString() {
		return "DeveloperDTO [name=" + name + ", experience=" + experience + ", salary=" + salary + ", workingFor="
				+ workingFor + ", designation=" + designation + ", isDifficult=" + isDifficult + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {

			if (obj instanceof DeveloperDTO) {

				DeveloperDTO dto = (DeveloperDTO) obj;

				if (dto.name.equals(this.name)) {
					return true;
				}
			}

		}

		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getWorkingFor() {
		return workingFor;
	}

	public void setWorkingFor(String workingFor) {
		this.workingFor = workingFor;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public boolean isDifficult() {
		return isDifficult;
	}

	public void setDifficult(boolean isDifficult) {
		this.isDifficult = isDifficult;
	}

}
