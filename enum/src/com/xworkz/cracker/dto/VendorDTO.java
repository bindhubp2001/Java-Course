package com.xworkz.cracker.dto;

import com.xworkz.cracker.constants.VenderGST;
import com.xworkz.cracker.constants.VendorSerialNumber;

public class VendorDTO {

	private String name;
	private VenderGST gst;
	private VendorSerialNumber number;

	public VendorDTO(String name, VenderGST gst,VendorSerialNumber number) {
		super();
		this.name = name;
		this.gst = gst;
		this.number = number;
	}

	@Override
	public String toString() {
		return "VendorDTO [name=" + name + ", gst=" + gst +", number=" + number+ "]";
	}
	
	public void setGst(VenderGST gst) {
		this.gst = gst;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumber(VendorSerialNumber number) {
		this.number = number;
	}
	
	

}
