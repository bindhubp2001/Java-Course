package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayDeclare {

	public static void main(String[] args) {

		Collection<String> rivers = new ArrayList<String>();

		rivers.add("Ganga");
		rivers.add("Yamuna");
		rivers.add("Nile");
		rivers.add("Thungabhadra");
		rivers.add("Amazon");

		// Access for , for each,iterator,stream
		// Interartor used access elements of collection

		System.out.println("Total Elements : " + rivers.size());

	    //Create a Iterator 
		Iterator<String> itr = rivers.iterator();//create a instance and use th concept of abstraction

		while (itr.hasNext()) {
			String value = itr.next();
			System.out.println(value);
		}
		System.out.println("----After remove Amazon----");
		rivers.remove("Amazon");
		
		Iterator<String> itr2 = rivers.iterator();
		while (itr2.hasNext()) {
			String value = itr2.next();
			System.out.println(value);
		}
		
		
		
		System.out.println("----After contains()----");
		
		
		
		boolean res=rivers.contains("Ganga");
		System.out.println(res);
		
		System.out.println("----After containsAll()----");
		
		Collection<String> rivers2 = new ArrayList<String>();
		
		rivers2.add("Ganga");
		rivers2.add("Yamuna");
		rivers2.add("Nile");
		rivers2.add("Thungabhadra");
		
		boolean res1=rivers.containsAll(rivers2);
		System.out.println(res1);
		
		System.out.println("--After remove All===");
		rivers.removeAll(rivers);
		Iterator<String> itr4 = rivers.iterator();
		while (itr4.hasNext()) {
			String value = itr4.next();
			System.out.println(value);
		}
		
		System.out.println("----After addAll()----");
		Collections.addAll(rivers, "Vella","Lonavala"); 
		Iterator<String> itr3 = rivers.iterator();
		while (itr3.hasNext()) {
			String value = itr3.next();
			System.out.println(value);
		}
		
		System.out.println("----After Clear()----");
		rivers.clear();
		System.out.println(rivers);
		

	}

}
