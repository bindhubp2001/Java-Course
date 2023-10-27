package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CitiesCollection {

	public static void main(String[] args) {
		
		Collection<String> cities = new ArrayList<String>();
		
		Collections.addAll(cities, "Banglore","Mysore","Mumabai","Goa","Jaipur","Manali","NewYork","Tokyo","Paris","Seoul","Shanghai",
				"Los Angles","Mascow","Dubai","Jakarta","Prague","Vienna","Chicago","Sydney","Berlin","Brussels","Bangkok");

		
		Iterator<String> cityInstance =cities.iterator();
		while(cityInstance.hasNext()) {
			String city=cityInstance.next();
			System.out.println(city);
		}
		
		System.out.println("\nTotal Cities : "+cities.size());
	}

}
