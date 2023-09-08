package com.xworkz.newspaper.app.dto;

public class DocterDTO {
	private String name;
	private int age;

	public DocterDTO() {

	}

	public DocterDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "DoterDTO [name=" + name + ", age=" + age + "]";
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

}
