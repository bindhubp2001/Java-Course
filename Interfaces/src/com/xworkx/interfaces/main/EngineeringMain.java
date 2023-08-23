package com.xworkx.interfaces.main;

import com.xworkx.interfaces.app.EngEngineeeringRules;
import com.xworkx.interfaces.impl.EngineeringRules;

public class EngineeringMain {

	public static void main(String[] args) {
		EngineeringRules engineeringRules=new EngEngineeeringRules();
		System.out.println("Wear Id : "+engineeringRules.wearId());
		engineeringRules.attendence();
		System.out.println("FEE : "+engineeringRules.fee());

	}

}
