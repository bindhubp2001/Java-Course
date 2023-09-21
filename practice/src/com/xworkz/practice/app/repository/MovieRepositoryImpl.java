package com.xworkz.practice.app.repository;

import com.xworkz.practice.app.dto.MovieDTO;

public class MovieRepositoryImpl implements MovieRepository {

	private MovieDTO[] dtos = new MovieDTO[TOTAL_MOVIES];
	private int pos;

	@Override
	public void save(MovieDTO dto) {

		if (pos < TOTAL_MOVIES) {
			this.dtos[pos] = dto;

			System.out.println(dto + " Store at position " + pos);
			this.pos++;
		} else {
			System.out.println("DS id FUll CANNOT STORE FURTHER.....");
		}
	}

	@Override
	public boolean isExist(MovieDTO dto) {

		for (int i = 0; i < pos; i++) {
			MovieDTO dto2 = this.dtos[i];

			if (dto2.equals(dto)) {
				System.out.println("Already EXIST");
				return true;
			}
		}

		return false;
	}

	@Override
	public MovieDTO findByName(String movieName) {
		for (int i = 0; i < pos; i++) {
			MovieDTO temp = this.dtos[i];

			if (temp.getMovieName().equals(movieName)) {
				System.out.println("DTO FOUND WITH Movie NAME " + movieName);
				return temp;
			}
		}
		return null;
	}

}
