package com.exapmles.superChaining.app;

public class Mushroom {
	public String type;
	public char vitamin;
	public String richProductionState;
	public boolean isAntioxident;
	
	public Mushroom(String type,char vitamin,String richProductionState,boolean isAntioxident) {
		this.isAntioxident=isAntioxident;
		this.richProductionState=richProductionState;
		this.type=type;
		this.vitamin=vitamin;
	}
	
}
