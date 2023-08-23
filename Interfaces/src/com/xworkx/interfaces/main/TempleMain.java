package com.xworkx.interfaces.main;

import com.xworkx.interfaces.app.TempleTempleRules;
import com.xworkx.interfaces.impl.TempleRules;

public class TempleMain {

	public static void main(String[] args) {
		TempleRules rules = new TempleTempleRules();
		rules.openTimings(11);
		rules.NoMobile();
		rules.noSmoking();

	}

}
