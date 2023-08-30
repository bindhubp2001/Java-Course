package com.xworkz.abstraction_interface.boot;

import com.xworkz.abstraction_interface.impl.OS;
import com.xworkz.abstraction_interface.impl.Programmer;
import com.xworkz.abstraction_interface.rules.Computer;

public class ProgrammerMain {

	public static void main(String[] args) {
		Computer computer=new OS();
		
		Programmer programmer=new Programmer();
		programmer.setComputer(computer);
		programmer.operate();

	}

}
