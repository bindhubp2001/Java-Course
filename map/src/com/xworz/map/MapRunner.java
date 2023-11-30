package com.xworz.map;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {

		Map<Double, String> aadharAndNamePair = new HashMap<Double, String>();

		System.out.println(aadharAndNamePair.isEmpty());
		
		aadharAndNamePair.put(024587238734d, "Sam");
		aadharAndNamePair.put(994582956734d, "Bindhu");
		aadharAndNamePair.put(394234555673d, "Shree");
		aadharAndNamePair.put(894384756355d, "Ani");
		aadharAndNamePair.put(124587238734d, "Avi");
		aadharAndNamePair.put(794582956734d, "Ram");
		aadharAndNamePair.put(594234555673d, "Ravi");
		aadharAndNamePair.put(194384756355d, "Raghu");
		aadharAndNamePair.put(114587238734d, "Sham");
		aadharAndNamePair.put(004582956734d, "Mona");
		

		System.out.println(aadharAndNamePair.size());
		System.out.println(aadharAndNamePair.isEmpty());

		Set<Double> aadharKey = aadharAndNamePair.keySet();
		aadharKey.forEach(n -> System.out.println(n));

		System.out.println("============================");

		Collection<String> nameValue = aadharAndNamePair.values();
		nameValue.forEach(n -> System.out.println(n));

		System.out.println("============================");

		Set<java.util.Map.Entry<Double, String>> entrySet = aadharAndNamePair.entrySet();
		entrySet.forEach(n -> System.out.println(n));

		System.out.println("============================");

		System.out.println("ContainsKey() : " + aadharAndNamePair.containsKey(124587238734d));
		System.out.println("ContainsValues() : "+aadharAndNamePair.containsValue("Sam"));
		
		System.out.println(aadharAndNamePair.get(394234555673d));//return the Value of that Key Holds
		//aadharAndNamePair.remove(194384756355d);
		
		System.out.println("*****************");
		System.out.println(aadharAndNamePair.get(194384756355d));
		
		//Entry(Interface) METHODS --> getKey(),getValue()
		for(Map.Entry entry:aadharAndNamePair.entrySet()) {
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		
		//Using Iterator
		System.out.println("\nUsing iterator ---------------....");
		Iterator itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
	}

}
