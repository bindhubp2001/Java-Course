package com.xworkz.association.boot;

import com.xworkz.association.app.PowerBattery;

public class PowerBankMain {
	public static void main(String[] args) {
		PowerBattery pb=new PowerBattery();
		
		System.out.println("MAIN CLASS");
		pb.startCharging();
		pb.stopCharging();
		
	}
}
