package com.example.encapsulation.boot;

import com.example.encapsulation.app.WhatsApp;

public class WhatsAppMain {
	public static void main(String[] args) {
		WhatsApp whatsapp = new WhatsApp();

		whatsapp.setMessaging("Hai");
		System.out.println(whatsapp.getMessaging());

		whatsapp.setVediocall("videocall");
		System.out.println(whatsapp.getVediocall());

		whatsapp.setGroupchat("Groupchat");
		System.out.println(whatsapp.getGroupchat());

		whatsapp.setStatus("Status");
		System.out.println(whatsapp.getStatus());

		whatsapp.setSharing("Sharing");
		System.out.println(whatsapp.getSharing());

		whatsapp.setVoicemassege("Voicemassege");
		System.out.println(whatsapp.getVoicemassege());

		whatsapp.setLocationSharing("LocationSharing");
		System.out.println(whatsapp.getLocationSharing());

		whatsapp.setPayment("Payment");
		System.out.println(whatsapp.getPayment());

		whatsapp.setSecurity("Security");
		System.out.println(whatsapp.getSecurity());

		whatsapp.setQRcode("QRcode");
		System.out.println(whatsapp.getQRcode());

		whatsapp.setDataStorage("DataStorage");
		System.out.println(whatsapp.getDataStorage());

		whatsapp.setBlock("Block");
		System.out.println(whatsapp.getBlock());

		whatsapp.setColor("color");
		System.out.println(whatsapp.getColor());
	}
}
