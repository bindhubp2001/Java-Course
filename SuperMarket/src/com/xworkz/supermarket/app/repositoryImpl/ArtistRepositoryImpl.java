package com.xworkz.supermarket.app.repositoryImpl;

import com.xworkz.supermarket.app.repository.ArtistRepository;

public class ArtistRepositoryImpl implements ArtistRepository {

	private int[] noOfPaintings = new int[10];
	private int index, i;

	@Override
	public void store(int noOfPaintings) {

		if (index < TOTAL_PAINTINGS) {
			this.noOfPaintings[index] = noOfPaintings;
			System.out.println("Tatal number of paint by artist " + i + " is " + noOfPaintings);
			this.index++;
			this.i++;
		} else {
			System.err.println("DATA STORE IS FULL,,cannot Store further...");
		}

	}

}
