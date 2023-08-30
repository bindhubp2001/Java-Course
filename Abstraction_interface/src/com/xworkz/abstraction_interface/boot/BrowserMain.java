package com.xworkz.abstraction_interface.boot;

import com.xworkz.abstraction_interface.impl.Browser;
import com.xworkz.abstraction_interface.impl.InternetImpl;
import com.xworkz.abstraction_interface.rules.Internet;

public class BrowserMain {

	public static void main(String[] args) {
		Internet internet = new InternetImpl();

		Browser browser = new Browser();
		browser.setInternet(internet);
		browser.connect();
	}

}
