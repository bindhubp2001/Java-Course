package com.xworkz.exception;

import org.w3c.dom.events.EventException;

public class ExceptionEvent {

	

	public void eventHandling() {
		System.out.println("ivoking eventHandling");
		checkedExecptionHandling();
	}

	public void checkedExecptionHandling() {
		System.out.println("ivoking checkedExecptionHandling");
		try {
			unCheckedExecptionHandling();
		} catch (Exception e) { 
			System.err.println("Exception event is Handled...");
			//e.printStackTrace();
		}
		
		System.out.println("After Handlig");
	}

	public void unCheckedExecptionHandling() {
		System.out.println("ivoking unCheckedExecptionHandling");
		errorHandling();
	}

	public void errorHandling() {
		System.out.println("ivoking errorHandling");
		runtimeExceptionHandling();
	}

	public void runtimeExceptionHandling() {
		System.out.println("ivoking runtimeExceptionHandling");
		
		throw new TypeNotPresentException("Uncheked",null);
	}
	
	public static void main(String[] args) {
		ExceptionEvent event=new ExceptionEvent();
		event.eventHandling();
		
		
	}

}