package com.examples.equals.app;

public class Thief {
	private String name;
	private int age;
	private int number;
	private String jailName;
	private int prisonNumber;
	private String location;

	public Thief() {

	}

	public Thief(String name, int age, int number, String jailName, int prisonNumber, String location) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
		this.jailName = jailName;
		this.prisonNumber = prisonNumber;
		this.location = location;
	}

	@Override
	public String toString() {

		return name + "\n" + age + "\n" + jailName + "\n" + number + "\n" + prisonNumber + "\n" + location;
	}

	@Override
	public boolean equals(Object obj) {
		Thief thief = (Thief) obj;

		if (thief.name.equals(name) && thief.jailName.equals(jailName) && thief.jailName.equals(jailName)
				&& thief.age == age && thief.number == number && thief.prisonNumber == prisonNumber)
			return true;
		return false;
	}

}
