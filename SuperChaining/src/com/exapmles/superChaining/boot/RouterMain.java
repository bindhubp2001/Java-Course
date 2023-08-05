package com.exapmles.superChaining.boot;

import com.exapmles.superChaining.app.WireLessRouter;

public class RouterMain {

	public static void main(String[] args) {
		WireLessRouter lessRouter =new WireLessRouter();
		System.out.println(lessRouter.feature);
		System.out.println(lessRouter.function);
		System.out.println(lessRouter.otherName);
		System.out.println(lessRouter.type);
		
		System.out.println("-------------------------");
		
		WireLessRouter lessRouter2 =new WireLessRouter("OverFlow Routing","Gateways","Route NetWork Packets","Wireless Routing");
		System.out.println(lessRouter2.feature);
		System.out.println(lessRouter2.function);
		System.out.println(lessRouter2.otherName);
		System.out.println(lessRouter2.type);

	}

}
