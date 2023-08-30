package com.xworkz.abstraction_interface.boot;

import com.xworkz.abstraction_interface.impl.Reciever;
import com.xworkz.abstraction_interface.impl.Sender;
import com.xworkz.abstraction_interface.rules.Messenger;

public class ReceiverMain {

	public static void main(String[] args) {
		Messenger messenger=new Sender();
		
		Reciever reciever=new Reciever();
		reciever.setMessenger(messenger);
		reciever.send();

	}

}
