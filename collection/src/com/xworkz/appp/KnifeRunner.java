package com.xworkz.appp;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.app.dto.KnifeDTO;

public class KnifeRunner {

	public static void main(String[] args) {
		
		KnifeDTO dto = new KnifeDTO("Steel", "Veggies", 199, 2);
		KnifeDTO dto1 = new KnifeDTO("Steel", "Veggies", 199, 2);
		KnifeDTO dto2 = new KnifeDTO("Iron", "Beef", 299, 1);
		KnifeDTO dto3 = new KnifeDTO("Iron", "Beef", 299, 1);
		KnifeDTO dto4 = new KnifeDTO("Copper", "Butter", 300, 2);
		KnifeDTO dto5 = new KnifeDTO("Gold", "Fruits", 599, 3);
		KnifeDTO dto6 = new KnifeDTO("Bronze", "Wire", 199, 1);
		KnifeDTO dto7 = new KnifeDTO("Bronze", "Wire", 299, 2);
		
		
		Collection<KnifeDTO> collection=new HashSet<KnifeDTO>();
		
		collection.add(dto6);
		collection.add(dto5);
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		collection.add(dto);
		
		System.out.println("count : "+collection.stream().sorted().count());
		collection.stream().collect(Collectors.toSet()).forEach(m-> System.out.println(m));
		System.out.println("-------------");
		
		List<KnifeDTO> listIterator = new LinkedList<KnifeDTO>();
		
		listIterator.add(0, dto7);
		listIterator.forEach(a-> System.out.println(a));
		System.out.println("----------");
		listIterator.addAll(0, collection);
		listIterator.forEach(a-> System.out.println(a));
		System.out.println("----------");
		System.out.println(listIterator.get(5));
		
		System.out.println("----------");
		System.out.println(listIterator.indexOf(dto7));
		
		System.out.println("----------");
		listIterator.remove(4);
		listIterator.forEach(o-> System.out.println(o));
		
		System.out.println("----------");
		listIterator.subList(0, 3).forEach(i-> System.out.println(i));

		System.out.println("----------");
		listIterator.set(1, dto7);
		listIterator.forEach(o-> System.out.println(o));
		System.out.println("**********************");

		List<String> listItr = new LinkedList<String>();
		
		listItr.add(0, "Bindhu");
		listItr.add(1, "Sam");
		listItr.add(2, "Shree");
		listItr.forEach(n-> System.out.println(n));
		
		System.out.println("----------");
		System.out.println("ele @ index 1 : "+listItr.get(1));
		
		System.out.println("----------");
		listItr.remove(1);
		listItr.forEach(n-> System.out.println(n));
		
		System.out.println("----------");
		System.out.println("index of Shree : "+listItr.indexOf("Shree"));
		
		System.out.println("----------");
		listItr.subList(0, 1).forEach(o-> System.out.println("Sublist : "+o));
		
		System.out.println("----------");
		System.out.println("Set : "+listItr.set(1, "Bindhu"));

		
		


	}

}
