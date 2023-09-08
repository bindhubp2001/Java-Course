package com.xworkz.newspaper.app.dto;

public class PrinterDTO {
	private int noOFPrinters;
	private String companyName;

	public PrinterDTO() {

	}

	public PrinterDTO(int noOFPrinters, String companyName) {
		super();
		this.noOFPrinters = noOFPrinters;
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "PrinterDTO [noOFPrinters=" + noOFPrinters + ", companyName=" + companyName + "]";
	}

	public int getNoOFPrinters() {
		return noOFPrinters;
	}

	public void setNoOFPrinters(int noOFPrinters) {
		this.noOFPrinters = noOFPrinters;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
