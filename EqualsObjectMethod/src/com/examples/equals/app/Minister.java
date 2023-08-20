package com.examples.equals.app;

public class Minister {
	private String name;
	private int minAge;
	private int experience;
	private String department;
	private String location;
	private double salary;

	public Minister() {

	}

	public Minister(String name, int minAge, int experience, String department, String location, double salary) {
		super();
		this.name = name;
		this.minAge = minAge;
		this.experience = experience;
		this.department = department;
		this.location = location;
		this.salary = salary;
	}

	@Override
	public String toString() {

		return name + "\n" + minAge + "\n" + experience + "\n" + department + "\n" + location + "\n" + salary;
	}

	@Override
	public boolean equals(Object obj) {
		Minister min = (Minister) obj;

		if (obj != null)
			System.out.println("Object is Not Null,,we can compare");

		else
			System.out.println("Object is Null,, cannot Comapre objects");

		if (min.name.equals(this.name))
			return true;

		return false;
	}

}
