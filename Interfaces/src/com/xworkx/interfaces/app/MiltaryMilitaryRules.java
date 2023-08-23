package com.xworkx.interfaces.app;

import com.xworkx.interfaces.impl.MilitaryRules;

public class MiltaryMilitaryRules implements MilitaryRules {

	@Override
	public boolean wearUniform() {
		return true;
	}

	@Override
	public String service() {
		return "Security";
	}

	@Override
	public int unitNumber() {
		return 100;
	}

}
