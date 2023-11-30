package com.xworkz.servlets.dto;

public class ContactInfoDTO {

	private String name;
	private String email;
	private String mobile;
	private String comment;

	public ContactInfoDTO(String name, String email, String mobile, String comment) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "ContactInfoDTO [name=" + name + ", email=" + email + ", mobile=" + mobile + ", comment=" + comment
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String number) {
		this.mobile = number;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
