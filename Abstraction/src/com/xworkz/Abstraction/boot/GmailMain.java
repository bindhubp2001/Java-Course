package com.xworkz.Abstraction.boot;

import com.xworkz.Abstraction.app.Email;
import com.xworkz.Abstraction.app.Gmail;

public class GmailMain {

	public static void main(String[] args) {
		Gmail gmail = new Email();
		gmail.sendMail();
		gmail.receiveMail();
		gmail.archive();
		gmail.createMail();
		gmail.attachFiles();
		
		System.out.println("-------------");
		
		gmail.formatBody();
		gmail.forward();
		gmail.markAsRead();
		gmail.markAsUnread();
		gmail.replyToSender();

	}

}
