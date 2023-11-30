package com.xworkz.set;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class SetRunner {

	public static void main(String[] args) {
		
		List<String> str1 = new LinkedList<String>();
		List<String> str2 = new LinkedList<String>();
		
		str1.add("Bindhu");
		str1.add("Ankita");
		str1.add("Nandu");
		str1.add("Kavya");
		str1.add("Mona");
		str1.add("Amruth");
		str1.add("Kavya");
		str1.add("Moni");
		str1.add("Arun");
		str1.add("Santosh");
		
		str2.add("Bharath");
		str2.add("Ankit");
		str2.add("Sam");
		str2.add("Karan");
		str2.add("Moni");
		str2.add("Arun");
		str2.add("Ross");
		str2.add("Mona");
		str2.add("Amruth");
		str2.add("Bindhu");
		
		
		str1.retainAll(str2);
		System.out.println("Printing the duplicate/comman values : "+str1);	
		
		System.out.println();
		str2.removeAll(str1);
		System.out.println("Printing the Non-Duplicate/Non Comman Values : "+str2);

	}

}
