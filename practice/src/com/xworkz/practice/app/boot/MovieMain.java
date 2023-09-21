package com.xworkz.practice.app.boot;

import com.xworkz.practice.app.dto.MovieDTO;
import com.xworkz.practice.app.repository.MovieRepository;
import com.xworkz.practice.app.repository.MovieRepositoryImpl;
import com.xworkz.practice.app.service.MovieService;
import com.xworkz.practice.app.service.MovieServiceImpl;

public class MovieMain {

	public static void main(String[] args) {
		
		MovieDTO dto=new MovieDTO("JAWAN", 8.9f, 20000000, "SRK", "DEEPIKA");
		MovieDTO dto2=new MovieDTO("JAWAN", 8.9f, 20000000, "SRK", "DEEPIKA");
		MovieRepository movieRepository=new MovieRepositoryImpl();
		MovieService movieService=new MovieServiceImpl(movieRepository);
		
		movieService.vaidateAndSave(dto);
		System.out.println();
		movieService.vaidateAndSave(dto2);
		
		System.out.println();
		
		MovieDTO dto3=movieService.findByName("JAWAN");
		System.out.println(dto3);
	}

}
