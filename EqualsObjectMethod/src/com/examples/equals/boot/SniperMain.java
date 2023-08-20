package com.examples.equals.boot;

import com.examples.equals.app.Sniper;

public class SniperMain {

	public static void main(String[] args) {
		Sniper sniper=new Sniper("RAGHU", 28, "DELHI", "GUN", 6, 50) ;
		System.out.println(sniper+"\n");
		
		Sniper sniper2=new Sniper("RAM", 28, "DELHI", "GUN", 6, 50) ;
		System.out.println(sniper2+"\n");
		
		boolean same=sniper.equals(sniper2);
		
		System.out.println("IS Contents are same : "+same);
		 

	}

}
