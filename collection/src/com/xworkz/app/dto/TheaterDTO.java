package com.xworkz.app.dto;

public class TheaterDTO implements Comparable<TheaterDTO> {

	private String name;
	private int capacity;
	private String movieRunning;
	private double balconyAmount;

	public TheaterDTO(String name, int capacity, String movieRunning, double balconyAmount) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.movieRunning = movieRunning;
		this.balconyAmount = balconyAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getMovieRunning() {
		return movieRunning;
	}

	public void setMovieRunning(String movieRunning) {
		this.movieRunning = movieRunning;
	}

	public double getBalconyAmount() {
		return balconyAmount;
	}

	public void setBalconyAmount(double balconyAmount) {
		this.balconyAmount = balconyAmount;
	}

	@Override
	public int compareTo(TheaterDTO arg) {

		TheaterDTO theater = this;

		if (theater.capacity == arg.capacity) {
			return 0;
		}

		if (theater.capacity < arg.capacity) {
			return 1;
		}

		if (theater.capacity > arg.capacity) {
			return -1;
		}

		throw new IllegalArgumentException("Cannot find...");
	}

	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", capacity=" + capacity + ", movieRunning=" + movieRunning
				+ ", balconyAmount=" + balconyAmount + "]";
	}

}
