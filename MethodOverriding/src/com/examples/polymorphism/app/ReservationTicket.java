package com.examples.polymorphism.app;

public class ReservationTicket extends Ticket{
	@Override
	public void displayBill() {
		System.out.println("call display Bill mwthod in Ticket Sub Class");

	}
}
