package com.xworkx.interfaces.main;

import com.xworkx.interfaces.app.PgPGRules;
import com.xworkx.interfaces.impl.PGRules;

public class PgMain {
	public static void main(String[] args) {
		PGRules pgRules=new PgPGRules();
		System.out.println("Note : "+pgRules.noBoysAllowed());
		System.out.println("HAS Washing Machine : "+pgRules.hasWashingMachine());
		System.out.println("RENT : "+pgRules.rent());

	}
}
