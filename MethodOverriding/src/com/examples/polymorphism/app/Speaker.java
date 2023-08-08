package com.examples.polymorphism.app;

public class Speaker extends Mic {
	@Override
	public void sound() {
		System.out.println("call Sound method in Mic Derrived Class");

	}
}
