package com.xworkz.cracker.dto;

import com.xworkz.cracker.constants.MovieDIscount;
import com.xworkz.cracker.constants.MovieGST;
import com.xworkz.cracker.constants.MoviePrice;

public class MovieDTO {

	private String movieName;
	private MoviePrice moviePrice;
	private MovieDIscount discount;
	private MovieGST gst;

	public MovieDTO(String movieName, MoviePrice moviePrice, MovieDIscount discount, MovieGST gst) {
		super();
		this.movieName = movieName;
		this.moviePrice = moviePrice;
		this.discount = discount;
		this.gst = gst;
	}

	@Override
	public String toString() {
		return "MovieDTO [movieName=" + movieName + ", moviePrice=" + moviePrice + ", discount=" + discount + ", gst="
				+ gst + "]";
	}

	public String getMovieName() {
		return movieName;
	}

	public MoviePrice getMoviePrice() {
		return moviePrice;
	}

	public MovieDIscount getDiscount() {
		return discount;
	}

	public MovieGST getGst() {
		return gst;
	}

}
