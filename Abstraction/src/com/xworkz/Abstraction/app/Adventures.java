package com.xworkz.Abstraction.app;

public abstract class Adventures {
	private void roadTrip() {
		System.out.println("calling RoadTrip Method.....");
	}

	public void manaliTrip() {
		System.out.println("calling manali Trip Method.....");
	}

	protected void rajasthanTrip() {
		System.out.println("calling rajasthan Trip Method.....");
	}

	void keralaTrip() {
		System.out.println("calling Kerala Trip Method.....");
	}

	public void mumbaiTrip() {
		System.out.println("calling MumbaiTrip Method.....");
	}

	public abstract void watergames();

	public abstract void skyDiving();

	public abstract void rollerCoster();

	public abstract void bungeeJump();

	protected abstract void paragliding();

}
