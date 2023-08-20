package com.examples.equals.boot;

import com.examples.equals.app.Mechanic;

public class MechanicMain {

	public static void main(String[] args) {
		Mechanic mechanic=new Mechanic("Mahesh", "KRR", 50, "DVG", false, true);
		System.out.println(mechanic+"\n");
		
		Mechanic mechanic2=new Mechanic("Mahesh", "KRR", 50, "DVG", false, true);
		System.out.println(mechanic2+"\n");
		
		boolean same =mechanic.equals(mechanic2);
		System.out.println("IS both object contents are same : "+same);

	}

}
