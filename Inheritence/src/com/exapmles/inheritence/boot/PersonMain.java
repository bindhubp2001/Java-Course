package com.exapmles.inheritence.boot;

import com.exapmles.inheritence.app6.*;

public class PersonMain {
	public static void main(String[] args) {
		Person person=new Person();
		person.personMethod();
		System.out.println("-------------------");
		
		Employee employee=new Employee();
		employee.empMethod();
		employee.personMethod();
		System.out.println("-------------------");
		
		Player player=new Player();
		player.playerMethod();
		player.personMethod();
		System.out.println("-------------------");
		
		Student student=new Student();
		student.studentMethod();
		student.personMethod();
	}
}
