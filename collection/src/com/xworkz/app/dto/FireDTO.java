package com.xworkz.app.dto;

import java.util.Objects;

public class FireDTO implements Cloneable {

	private String color;
	private String volume;
	private String cause;

	public FireDTO(String color, String volume, String cause) {
		super();
		this.color = color;
		this.volume = volume;
		this.cause = cause;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Running clone ..");
		return super.clone();
	}

	@Override
	public String toString() {
		return "FireDTO [color=" + color + ", volume=" + volume + ", cause=" + cause + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	@Override
	public int hashCode() {
		return 102;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FireDTO other = (FireDTO) obj;
		return Objects.equals(cause, other.cause) && Objects.equals(color, other.color)
				&& Objects.equals(volume, other.volume);
	}

}
