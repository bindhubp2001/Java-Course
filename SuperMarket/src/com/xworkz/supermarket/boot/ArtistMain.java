package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.ArtistRepository;
import com.xworkz.supermarket.app.repositoryImpl.ArtistRepositoryImpl;

public class ArtistMain {

	public static void main(String[] args) {

		ArtistRepository artistRepository = new ArtistRepositoryImpl();

		artistRepository.store(20);
		artistRepository.store(30);
		artistRepository.store(50);
		artistRepository.store(40);
		artistRepository.store(60);
		artistRepository.store(20);
		artistRepository.store(20);
		artistRepository.store(22);
		artistRepository.store(23);
		artistRepository.store(29);
		artistRepository.store(90);
	}

}
