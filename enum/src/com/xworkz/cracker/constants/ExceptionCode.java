package com.xworkz.cracker.constants;

public enum ExceptionCode {

	ARITHMETIC_EXCEPTION("num/0"), NULL_POINTER_EXCEPTION("name=null  name.length");

	private String code;

	private ExceptionCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

}
