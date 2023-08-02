package com.exapmles.inheritence.boot;

import com.exapmles.inheritence.app5.*;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.mobileMethod();
		System.out.println("-------------------");

		SmartPhone smart = new SmartPhone();
		smart.smartMetod();
		smart.mobileMethod();
		System.out.println("-------------------");

		Android android = new Android();
		android.androidMetod();
		android.mobileMethod();
		System.out.println("-------------------");

		FlipPhone flip = new FlipPhone();
		flip.mobileMethod();
		flip.flipPhoneMetod();
		System.out.println("-------------------");

		SliderPhone phone = new SliderPhone();
		phone.mobileMethod();
		phone.sliderPhoneMetod();
		System.out.println("-------------------");

	}
}
