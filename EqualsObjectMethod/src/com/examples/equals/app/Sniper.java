package com.examples.equals.app;

public class Sniper {
	private String name;
	private int age;
	private String location;
	private String equipment;
	private int height;
	private int weight;
	
	public Sniper() {
		// TODO Auto-generated constructor stub
	}

	public Sniper(String name, int age, String location, String equipment, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
		this.equipment = equipment;
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\n"+age+"\n"+location+"\n"+height+"\n"+weight+equipment;
	}
	
	@Override
	public boolean equals(Object obj) {
			Sniper sniper=(Sniper)obj;
			
			if(sniper.name.equals(this.name)&& sniper.age == this.age && sniper.height == this.height)
				return true;
		return false;
	}
	
	
}
