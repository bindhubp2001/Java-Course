package com.xworkz.cracker.constants;

public enum VendorSerialNumber {
	
	NYKAA("27AAFCN5072P1ZV"),PLUM("38KJ768SDFS786"),SUGAR("64GDFGSF75GFD"),PURPLE("45JHJK56565");

	private String serialNumber;
	
	private VendorSerialNumber(String serailNumString) {
		this.serialNumber=serailNumString;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}

}
