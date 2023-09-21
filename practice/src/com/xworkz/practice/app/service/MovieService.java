package com.xworkz.practice.app.service;

import com.xworkz.practice.app.dto.MovieDTO;

public interface MovieService {
	
	boolean vaidateAndSave(MovieDTO dto);
	
	MovieDTO findByName(String movieName);

}
