package com.xworkz.association.app2;

public class Browser {
public Internet internet=new Internet();

	public void getRequest()
	{
		System.out.println("Getting Request");
		this.internet.wiFi();
	}
	public void response()
	{
		System.out.println("Response to Request");
		this.internet.mobileHotspot();
	}

}
