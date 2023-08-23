package com.xworkx.interfaces.app;

import com.xworkx.interfaces.impl.PGRules;

public class PgPGRules implements PGRules {

	@Override
	public String noBoysAllowed() {
		
		return "BOYS NOT ALLOWED";
	}

	@Override
	public boolean hasWashingMachine() {
		
		return true;
	}

	@Override
	public double rent() {
		
		return 5000;
	}

}
