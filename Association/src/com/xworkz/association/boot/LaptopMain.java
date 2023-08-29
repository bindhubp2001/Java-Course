package com.xworkz.association.boot;

import com.xworkz.association.app.LaptopProcessor;
import com.xworkz.association.app.Processor;

public class LaptopMain {

	public static void main(String[] args) {
		String brand="Lenovo";
		Processor processor=new Processor();
		
		LaptopProcessor laptopProcessor=new LaptopProcessor(brand);
		
		laptopProcessor.setProcessor(processor);
		
		laptopProcessor.proceesorType("Intel5");
		laptopProcessor.generation("4G");
		laptopProcessor.ram(16);
		laptopProcessor.compute();
	}

}
