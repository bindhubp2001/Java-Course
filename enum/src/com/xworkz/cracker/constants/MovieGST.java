package com.xworkz.cracker.constants;

public enum MovieGST {

	SSE("465746HFFF"), TOP_GUN("DFHGFH7654");

	private String gst;

	private MovieGST(String gst) {
		this.gst = gst;
	}
	
	public String getGst() {
		return gst;
	}

}
