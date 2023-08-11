package com.example.encapsulation.boot;

import com.example.encapsulation.app.PhonePay;

public class PhonePayMain {

	public static void main(String[] args) {
		PhonePay pay = new PhonePay();

		pay.setSize(100);
		pay.setUserName("Nandini");
		pay.setUpi("4545454545@ybl");
		pay.setTax(30.5f);
		pay.setSenderName("Nandini");
		pay.setReceiverName("Bindhu");
		pay.setTxnId(98547899);
		pay.setTime(0.5f);
		pay.setAmount(456000);
		pay.setBank("Canara");
		pay.setLocation("Chitradurga");

		System.out.println(pay.getSize());
		System.out.println(pay.getUserName());
		System.out.println(pay.getUpi());
		System.out.println(pay.getTax());
		System.out.println(pay.isSafe());
		System.out.println(pay.getTxnId());
		System.out.println(pay.getSenderName());
		System.out.println(pay.getReceiverName());
		System.out.println(pay.getTime());
		System.out.println(pay.isFast());
		System.out.println(pay.isCreditCard());
		System.out.println(pay.getAmount());
		System.out.println(pay.getBank());
		System.out.println(pay.getLocation());
	}

}
