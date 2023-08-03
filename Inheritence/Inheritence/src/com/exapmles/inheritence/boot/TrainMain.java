package com.exapmles.inheritence.boot;

import com.exapmles.inheritence.app8.*;

public class TrainMain {
	public static void main(String[] args) {
		System.out.println("Calling Main Class");
		Train train=new Train();
		System.out.println("Train Name : "+train.trainMethod());
		System.out.println("------------------------");
		
		Metro metro=new Metro();
		Train train1=new Metro();
		System.out.println("Train Name : "+metro.trainMethod());
		System.out.println("Metro Line : "+metro.metroMethod());
		System.out.println("------------------------");
	}
}
