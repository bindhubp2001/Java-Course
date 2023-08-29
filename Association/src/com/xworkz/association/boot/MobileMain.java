package com.xworkz.association.boot;

import com.xworkz.association.app.Charger;
import com.xworkz.association.app.Mobile;

public class MobileMain {

	public static void main(String[] args) {
		String shape = "Rectangle";
		
		Charger charger=new Charger();
		
		Mobile mobile=new Mobile(shape);
		
		mobile.setCharger(charger);
		
		mobile.brandName();
		mobile.brandName(777);
		mobile.brandName(20);
		mobile.brandName("SamSung");

	}

}
