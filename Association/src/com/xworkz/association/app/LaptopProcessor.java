package com.xworkz.association.app;

public class LaptopProcessor {
	String brand;
	private Processor processor;
	
	public LaptopProcessor(String brand) {
		this.brand=brand;
		System.out.println(this.brand);	
	}
	
	public void setProcessor(Processor processor) {
		this.processor=processor;
	}
	
	public void generation(String generation) {
		System.out.println("Generation : "+generation);
		this.processor.cacheSize(100);
		this.processor.ram("20GB");
		this.processor.spped(120);
		this.processor.madeOf("Silicon");
	}
	public void ram(int ram) {
		System.out.println("RAM : "+ram);
	}
	public void compute() {
		System.out.println("calling compute method in LAPTOpProcessor Class");
	}
	public void proceesorType(String ptype) {
		System.out.println("Processor Type : "+ptype);
	}
}
