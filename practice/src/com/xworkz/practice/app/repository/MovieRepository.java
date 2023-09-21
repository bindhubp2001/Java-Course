package com.xworkz.practice.app.repository;

import com.xworkz.practice.app.dto.MovieDTO;

public interface MovieRepository {
	int TOTAL_MOVIES=10;
	
	void save(MovieDTO dto);
	
	boolean isExist(MovieDTO dto);
	
	MovieDTO findByName(String movieName);
}
