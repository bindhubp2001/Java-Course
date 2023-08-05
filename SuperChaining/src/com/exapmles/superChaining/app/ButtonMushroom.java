package com.exapmles.superChaining.app;

public class ButtonMushroom extends Mushroom {

	public ButtonMushroom() {
		super("Chestnut Mushrooms ",'D',"kerala",false);
		System.out.println("Calling No-arg Constuctor");
	}

	public ButtonMushroom(String type, char vitamin, String richProductionState, boolean isAntioxident) {
		super(type,vitamin,richProductionState,isAntioxident);
		System.out.println("Calling Parameterised Constructor");
	}
}