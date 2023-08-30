package com.xworkz.abstraction_interface.boot;

import com.xworkz.abstraction_interface.impl.Mobile;
import com.xworkz.abstraction_interface.impl.Speaker;
import com.xworkz.abstraction_interface.rules.Bluetooth;

public class SpeakerMain {

	public static void main(String[] args) {
		Bluetooth bluetooth=new Mobile();
		
		Speaker speaker=new Speaker();
		speaker.setBluetooth(bluetooth);
		speaker.wirelessConnect();
		

	}

}
