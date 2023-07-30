package com.xworkz.association.app4;

public class Shop {
	
	public SalesMan sales;
public void items()
{
	System.out.println("Shop has Lot of items");
	if(sales!=null)
	{
		this.sales.salesItem();
	}
	else {
		System.err.println("Cannot Invoke");
	}
}
public void gst()
{
	System.out.println("Pay GST");
	if(sales!=null)
	{
		this.sales.travel();
	}
	else {
		System.err.println("Cannot Invoke");
	}
}

}
