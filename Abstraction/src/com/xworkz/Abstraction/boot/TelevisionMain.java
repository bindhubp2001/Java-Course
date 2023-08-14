package com.xworkz.Abstraction.boot;

import com.xworkz.Abstraction.app.Xiaomi;

public class TelevisionMain {

	public static void main(String[] args) {
		Xiaomi xiaomi = new Xiaomi();
		xiaomi.volumeUp();
		xiaomi.volumeDown();
		System.out.println(xiaomi.powerOn());
		System.out.println(xiaomi.powerOff());
		xiaomi.switchToGame();

		xiaomi.setFavChannel();

	}

}
