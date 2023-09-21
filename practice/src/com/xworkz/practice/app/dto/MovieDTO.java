package com.xworkz.practice.app.dto;

import java.io.Serializable;

public class MovieDTO implements Serializable {

	private String movieName;
	private float rating;
	private double budget;
	private String heroName;
	private String heroinName;

	public MovieDTO() {
		// TODO Auto-generated constructor stub
	}

	public MovieDTO(String movieName, float floating, double budget, String heroName, String heroinName) {
		super();
		this.movieName = movieName;
		this.rating = floating;
		this.budget = budget;
		this.heroName = heroName;
		this.heroinName = heroinName;
	}

	@Override
	public String toString() {
		return "MovieDTO [movieName=" + movieName + ", rating=" + rating + ", budget=" + budget + ", heroName="
				+ heroName + ", heroinName=" + heroinName + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof MovieDTO) {
				MovieDTO dto = (MovieDTO) obj;
				if (dto.movieName.equals(movieName) && dto.heroName.equals(heroName)
						&& dto.heroinName.equals(heroinName) && dto.budget == budget && dto.rating == rating) {
					return true;
				}
			}
		}
		return super.equals(obj);
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float floating) {
		this.rating = floating;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroinName() {
		return heroinName;
	}

	public void setHeroinName(String heroinName) {
		this.heroinName = heroinName;
	}

}
