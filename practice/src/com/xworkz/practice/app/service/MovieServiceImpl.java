package com.xworkz.practice.app.service;

import com.xworkz.practice.app.dto.MovieDTO;
import com.xworkz.practice.app.repository.MovieRepository;

public class MovieServiceImpl implements MovieService {

	private MovieRepository movieRepository;

	public MovieServiceImpl(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	@Override
	public boolean vaidateAndSave(MovieDTO dto) {

		if (dto != null) {
			String movieName = dto.getMovieName();
			String heroName = dto.getHeroName();
			String heroinName = dto.getHeroinName();
			float rating = dto.getRating();
			double budget = dto.getBudget();

			if (movieName != null && !movieName.isEmpty() && movieName.length() >= 1 && movieName.length() <= 30) {
				System.out.println("MOVIE NAME  is Valid");
			} else {
				System.out.println("MOVIE NAME  is invalid");
				return false;
			}

			if (heroName != null && !heroName.isEmpty() && heroName.length() >= 1 && heroName.length() <= 30) {
				System.out.println("HERO NAME  is Valid");
			} else {
				System.out.println("HERO NAME  is invalid");
				return false;
			}

			if (heroinName != null && !heroinName.isEmpty() && heroinName.length() >= 1 && heroinName.length() <= 30) {
				System.out.println("HEROIN NAME  is Valid");
			} else {
				System.out.println("HEROIN NAME  is invalid");
				return false;
			}

			if (rating != 0) {
				System.out.println("rating is valid");
			} else {
				System.out.println("rating is invalid");
			}

			if (budget != 0) {
				System.out.println("budjet is valid");
			} else {
				System.out.println("budjet is invalid");
			}
			
			if(!this.movieRepository.isExist(dto)) {
				this.movieRepository.save(dto);
				return true;
			}

		}

		return false;
	}

	@Override
	public MovieDTO findByName(String movieName) {

		if (movieName != null && !movieName.isEmpty() && movieName.length() >= 3 && movieName.length() <= 20) {
			System.out.println("MOVIE NAME is Valid..will Find");
			MovieDTO dto = this.movieRepository.findByName(movieName);
			return dto;

		} else {
			System.err.println("MOVIE NAME is invalid");

		}

		return null;
	}

}
