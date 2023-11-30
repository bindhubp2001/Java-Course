package com.xworkz.crud_user.dto;

import java.io.Serializable;

public class UserDTO implements Serializable{

	private String name;
	private int age;
	private double salary;
	private String company;
	private String workingRole;
	private boolean isDifficult;
	private String gender;
	private String location;
	private String state;
	private String country;

	public UserDTO(String name, int age, double salary, String company, String workingRole, boolean isDifficult,
			String gender, String location, String state, String country) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.company = company;
		this.workingRole = workingRole;
		this.isDifficult = isDifficult;
		this.gender = gender;
		this.location = location;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", age=" + age + ", salary=" + salary + ", company=" + company
				+ ", workingRole=" + workingRole + ", isDifficult=" + isDifficult + ", gender=" + gender + ", location="
				+ location + ", state=" + state + ", country=" + country + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + (isDifficult ? 1231 : 1237);
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((workingRole == null) ? 0 : workingRole.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof UserDTO))
			return false;
		UserDTO other = (UserDTO) obj;
		if (age != other.age)
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (isDifficult != other.isDifficult)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (workingRole == null) {
			if (other.workingRole != null)
				return false;
		} else if (!workingRole.equals(other.workingRole))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWorkingRole() {
		return workingRole;
	}

	public void setWorkingRole(String workingRole) {
		this.workingRole = workingRole;
	}

	public boolean isDifficult() {
		return isDifficult;
	}

	public void setDifficult(boolean isDifficult) {
		this.isDifficult = isDifficult;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
