package com.xworkz.supermarket.app.serviceImpl;

import com.xworkz.supermarket.app.repository.ArtistRepository;
import com.xworkz.supermarket.app.service.ArtistService;

public class ArtistServiceImpl implements ArtistService{
	
	private ArtistRepository artistRepository;
	
	public ArtistServiceImpl(ArtistRepository artistRepository) {
		this.artistRepository=artistRepository;
	}

	@Override
	public boolean validateAndSave(int noOfPaintings) {
		if(noOfPaintings!=0) {
			System.out.println("Data is valid");
			this.artistRepository.store(noOfPaintings);
		}
		else {
			System.err.println("Data is invalid");
		}
		return false;
	}

}
