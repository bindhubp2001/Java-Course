package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class StateCollection {

	public static void main(String[] args) {
		
		Collection<String> states = new ArrayList<String>();
		
		Collections.addAll(states, "Karnataka","Tamil Nadu","Kerala","Goa","Andra Pradesh","Madhya Pradesh","Telangana",
									"Gujarath","Maharashtra","Rajasthan","Arunachal Pradesh","Assam","Bihar","Chhattisgarh",
									"Haryana","Himachal Pradesh","Jammu and Kashmir","Jharkhand","Manipur","Meghalaya","Mizoram"
									,"Nagaland","Odisha","Punjab","Sikkim","Tripura","Uttar Pradesh","Uttarakhand","West Bengal");

		Iterator<String> stateInstancs = states.iterator();
		while(stateInstancs.hasNext()) {
			String stateName = stateInstancs.next();
			System.out.println(stateName);
		}
		
		System.out.println("\nTOTAL STATES :  "+states.size());
	}

}
