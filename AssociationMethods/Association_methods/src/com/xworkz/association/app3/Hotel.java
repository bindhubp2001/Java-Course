package com.xworkz.association.app3;

public class Hotel {
	
	public Cook cook;
	
	public void management()
	{
		System.out.println("Hotel Management");
		if(cook!=null)
		{
			this.cook.cooks();
		}
		else {
			System.err.println("Cannot Invoke");
		}
	}
	public void gst()
	{
		System.out.println("GST of Hotel is XXX");
		
		if(cook!=null)
		{
			this.cook.varityFood();
		}
		else {
			System.err.println("Cannot Invoke");
		}
	}
}
