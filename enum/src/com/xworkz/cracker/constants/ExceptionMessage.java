package com.xworkz.cracker.constants;

public enum ExceptionMessage {

	ARITHMETIC_EXCEPTION("ArithmeticException"), NULL_POINTER_EXCEPTION("NullPointerException");

	private String msg;

	private ExceptionMessage(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
}
