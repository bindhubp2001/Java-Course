package com.xworkz.abstraction_interface.impl;

import com.xworkz.abstraction_interface.rules.Messenger;

public class Sender implements Messenger {

	@Override
	public void sendMsg() {
		System.out.println("Implemenation in Sender Class...");

	}

}
