package com.exmaples.casting.util;

public class Sample {
boolean active;
void ss()
{
	boolean active=true;
	System.out.println(active);
}
public static void main(String[] args) {
	Sample sample=new Sample();
	System.out.println(sample.active);
	Sample sample2=sample;
	sample2.ss();
	System.out.println(sample.active);
	System.out.println(sample2.active);
	
	
}
}
