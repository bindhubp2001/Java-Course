package com.xworkz.cracker.constants;

public enum VenderGST {
	
	NYKAA("27AAFCN5072P1ZV"),PLUM("38KJ768SDFS786"),SUGAR("64GDFGSF75GFD"),PURPLE("45JHJK56565");
	
	private String gstNumber;
	
	private VenderGST(String gstNumber) {
		this.gstNumber=gstNumber;
	}
	
	public String getGstNumber() {
		return gstNumber;
	}

}
