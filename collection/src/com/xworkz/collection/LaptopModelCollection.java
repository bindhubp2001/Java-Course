package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class LaptopModelCollection {

	public static void main(String[] args) {
		
		Collection<String> laptopModels = new ArrayList<String>();
		
		Collections.addAll(laptopModels, "Lenovo","Dell","HP","Asus","MacBook","ThinkPad","Apple MAckBook Pro","Aspire","Dell Inspiron","Dell XPS 13-9350",
										"Mac Book Air","MacBook Pro 13-inch","Microsoft surface","HP Pavilion Laptop","Zen Book","24MC Laptops","Acer","AGB","AlienWare","Avita",
										"Champion computers","Corsiar","CyberPowerPC","DEEQ","Fujitsu","GigaByte","HCL","Hisense","Honer","Huawei",
										"Hynduai","iBall","iLife","Infinix","Jio","Jumper","Lava","LG","MicroMax","Micorsoft",
										"MSI","Nokia","Panasonic","Razer","RDP","Realme","Redmi","Samsung","Smartron","Sony");
		
		Iterator<String> lapInstances =laptopModels.iterator();
		while(lapInstances.hasNext()) {
			String lap=lapInstances.next();
			System.out.println(lap);
		}
		
		System.out.println("\nTotal Laptop Models : "+laptopModels.size());

	}

}
