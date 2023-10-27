package com.xworkz.servlets.dto;

public class EnquiryDTO {
	
	private String name;
	private String mobile;
	private String email;
	private String dob;
	private String location;
	private String password;
	private String confirmPassword;
	
	public EnquiryDTO() {
		
	}

	public EnquiryDTO(String name, String mobile, String email, String dob, String location, String password,
			String confirmPassword) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
		this.location = location;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	

}
