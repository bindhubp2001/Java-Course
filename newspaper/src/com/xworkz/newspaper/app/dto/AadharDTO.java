package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class AadharDTO implements Serializable{
	private long aadharNumber;
	private String state;
	private String lang;
	
	public AadharDTO() {
		
	}

	public AadharDTO(long aadharNumber, String state, String lang) {
		super();
		this.aadharNumber = aadharNumber;
		this.state = state;
		this.lang = lang;
	}
	

	@Override
	public String toString() {
		return "AadharDTO [aadharNumber=" + aadharNumber + ", state=" + state + ", lang=" + lang + "]";
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	
	
}
