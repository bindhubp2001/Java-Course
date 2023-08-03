package com.exmaples.casting.boot;

import com.exmaples.casting.app2.*;
import com.exmaples.casting.util.BrowserUtil;

public class BrowserMain {
	public static void main(String[] args) {
		System.out.println("Running Maain Class.......");
		
		Browser browser=new Browser();
		
		Chrome chrome=new Chrome();
		
		MicroSoftEdge edge=new MicroSoftEdge();
		
		FireFox fireFox=new FireFox();
		
		OperaBrowser opera=new OperaBrowser();
		
		BrowserUtil browserUtil=new BrowserUtil();
		System.out.println("Calling run method with Browser ref");
		browserUtil.run(browser);
		System.out.println("--------------------------------------");
		
		BrowserUtil browserUtil2=new BrowserUtil();
		System.out.println("Calling run method with Chrome ref");
		browserUtil2.run(chrome);
		System.out.println("--------------------------------------");
		
		BrowserUtil browserUtil3=new BrowserUtil();
		System.out.println("Calling run method with Microsoft ref");
		browserUtil3.run(edge);
		System.out.println("--------------------------------------");
		
		BrowserUtil browserUtil4=new BrowserUtil();
		System.out.println("Calling run method with FireFox ref");
		browserUtil4.run(fireFox);
		System.out.println("--------------------------------------");
		
		BrowserUtil browserUtil5=new BrowserUtil();
		System.out.println("Calling run method with FireFox ref");
		browserUtil5.run(opera);
		
		
	}
}
