package com.xworkz.association.app5;

public class Garage {
	public Mechanic mech;
 public void tools()
 
 {
	 System.out.println("Garage has Tools");
	 if(mech!=null)
		{
			this.mech.washes();
		}
		else {
			System.err.println("Cannot Invoke");
		}
 }
 public void gst()
 {
	 System.out.println("pay GST");
	 if(mech!=null)
		{
			this.mech.doPuncher();
		}
		else {
			System.err.println("Cannot Invoke");
		}
 }
 
}
