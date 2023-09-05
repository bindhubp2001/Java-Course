package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.ArtistRepository;
import com.xworkz.supermarket.app.repositoryImpl.ArtistRepositoryImpl;
import com.xworkz.supermarket.app.service.ArtistService;
import com.xworkz.supermarket.app.serviceImpl.ArtistServiceImpl;

public class ArtistServiceRunner {

	public static void main(String[] args) {
		
		ArtistRepository artistRepository=new ArtistRepositoryImpl();
		ArtistService artistService=new ArtistServiceImpl(artistRepository);
		
		artistService.validateAndSave(9);
		artistService.validateAndSave(0);

	}

}
