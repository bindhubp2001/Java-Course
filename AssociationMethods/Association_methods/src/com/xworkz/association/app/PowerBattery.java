package com.xworkz.association.app;

public class PowerBattery {
	public Battery battery;
	
	public void startCharging()
	{
		System.out.println("Start Charging");
		if(battery !=null)
		{
			this.battery.charge();
		}
		else
		{
			System.err.println("Cannot Invoke");
		}
	}
	public void stopCharging()
	{
		System.out.println("Stop Charging");
		if(battery !=null)
		{
			this.battery.getRemainingCapacity();
		}
		else
		{
			System.err.println("Cannot Invoke");
		}
	}
	
}

