package com.xworkz.abstraction_interface.impl;

import com.xworkz.abstraction_interface.rules.Messenger;

public class Reciever {
	private Messenger messenger;
	
	public void send() {
		System.out.println("invoking method in receiver class....");
		this.messenger.sendMsg();
	}
	
	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}
}
