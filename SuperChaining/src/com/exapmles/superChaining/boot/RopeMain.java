package com.exapmles.superChaining.boot;

import com.exapmles.superChaining.app.*;

public class RopeMain {

	public static void main(String[] args) {
		System.out.println("Running Main..........");
		PolysterRope polysterRope=new PolysterRope();
		System.out.println(polysterRope.type);
		System.out.println(polysterRope.isWaterAbsorption);
		System.out.println(polysterRope.isFlexible);
		System.out.println(polysterRope.meltingpoint);
		
		System.out.println("-----------------");
		
		PolysterRope polysterRope2=new PolysterRope("Cotton",false,true,300);
		System.out.println(polysterRope2.type);
		System.out.println(polysterRope2.isWaterAbsorption);
		System.out.println(polysterRope2.isFlexible);
		System.out.println(polysterRope2.meltingpoint);
	}

}
