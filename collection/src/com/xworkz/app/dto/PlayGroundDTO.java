package com.xworkz.app.dto;

import java.util.Objects;

public class PlayGroundDTO {

	private String name;
	private Double areaSquare;
	private String playGame;
	private Integer seats;

	public PlayGroundDTO(String name, Double areaSquare, String playGame, Integer seats) {
		super();
		this.name = name;
		this.areaSquare = areaSquare;
		this.playGame = playGame;
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "PlayGroundDTO [name=" + name + ", areaSquare=" + areaSquare + ", playGame=" + playGame + ", seats="
				+ seats + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(areaSquare, name, playGame, seats);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayGroundDTO other = (PlayGroundDTO) obj;
		return Objects.equals(areaSquare, other.areaSquare) && Objects.equals(name, other.name)
				&& Objects.equals(playGame, other.playGame) && Objects.equals(seats, other.seats);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAreaSquare() {
		return areaSquare;
	}

	public void setAreaSquare(Double areaSquare) {
		this.areaSquare = areaSquare;
	}

	public String getPlayGame() {
		return playGame;
	}

	public void setPlayGame(String playGame) {
		this.playGame = playGame;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

}
