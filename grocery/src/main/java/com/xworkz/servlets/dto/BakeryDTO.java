package com.xworkz.servlets.dto;

public class BakeryDTO {
	
	private String name;
	private String price;
	private String quantity;
	private String discount;
	private String gst;
	private String manf;
	private String exp;
	
	public BakeryDTO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public String getManf() {
		return manf;
	}

	public void setManf(String manf) {
		this.manf = manf;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public BakeryDTO(String name, String price, String quantity, String discount, String gst, String manf, String exp) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
		this.gst = gst;
		this.manf = manf;
		this.exp = exp;
	}

}
