package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class GarageCollection {

	public static void main(String[] args) {

		Collection<String> tools = new ArrayList<String>();

		tools.add("PLier");
		tools.add("Spanner");
		tools.add("Hammer");
		tools.add("Saw");
		tools.add("ScrewDriver");
		tools.add("Jack");
		tools.add("Cutter");

		Collection<String> tools2 = new ArrayList<String>();

		tools2.add("Flash Light");
		tools2.add("Wrencher");
		
		tools.addAll(tools2);//allAll()
		
		Collection<String> tools3 = new ArrayList<String>();

		tools3.add("Saw");
		tools3.add("Cutter");

		boolean contain = tools.containsAll(tools3);//containsAll()
		System.out.println("is Contain : "+contain);

		Collection<String> tools4 = new ArrayList<String>();

		tools4.add("Spanner");
		tools4.add("Screw");

		boolean remove = tools.removeAll(tools4);//removeAll()
		System.out.println("is Removed : "+remove);

		System.out.println(tools);
		System.out.println(tools4);

	}

}
