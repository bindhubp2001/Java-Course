package com.examples.polymorphism.app;

public class MetalGate extends Gate{
	@Override
	public void close() {
		System.out.println("Invoke close method in Gate Sub Class");
	}
}
