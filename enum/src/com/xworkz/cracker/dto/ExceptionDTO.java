package com.xworkz.cracker.dto;

import com.xworkz.cracker.constants.ExceptionCode;
import com.xworkz.cracker.constants.ExceptionMessage;

public class ExceptionDTO {

	private ExceptionCode code;
	private ExceptionMessage exceptionMessage;

	public ExceptionDTO(ExceptionCode code, ExceptionMessage exceptionMessage) {
		super();
		this.code = code;
		this.exceptionMessage = exceptionMessage;
	}

	@Override
	public String toString() {
		return "ExceptionDTO [code=" + code + ", exceptionMessage=" + exceptionMessage + "]";
	}

	public ExceptionCode getCode() {
		return code;
	}

	public ExceptionMessage getExceptionMessage() {
		return exceptionMessage;
	}

}
