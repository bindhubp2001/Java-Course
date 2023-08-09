package in.examples.overload_override.boot;

import in.examples.overload_override.app.Pub;
import in.examples.overload_override.app.PubHouse;

public class PubMain {

	public static void main(String[] args) {
		Pub pub = new Pub();
		pub.pub();
		pub.pub("Josh");
		pub.pub("Josh", 7);
		pub.pub("Josh", 7, "Shivanagar");
		pub.pub("Josh", 7, "Shivanagar", "Bengalore");
		pub.pub("Josh", 7, "Shivanagar", "Bengalore", 21);

		System.out.println("\nOverride using parent clss ref....\n");

		Pub pub2 = new PubHouse();
		pub2.pub();
		pub2.pub("Mathira");
		pub2.pub("Mathira", 6);
		pub2.pub("Mathira", 6, "MGRoad");
		pub2.pub("Mathira", 6, "MGRoad", "Bengalore");
		pub2.pub("Mathira", 6, "MGRoad", "Bengalore", 22);

		System.out.println("\nOverride using child clss ref....\n");

		PubHouse pub3 = new PubHouse();
		pub3.pub();
		pub3.pub("Navaranga");
		pub3.pub("Navaranga", 8);
		pub3.pub("Navaranga", 8, "rajajinagar");
		pub3.pub("Navaranga", 8, "rajajinagar", "Bengalore");
		pub3.pub("Navaranga", 8, "rajajinagar", "Bengalore", 20);

	}

}
