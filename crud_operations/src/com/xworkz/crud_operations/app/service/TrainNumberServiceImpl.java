package com.xworkz.crud_operations.app.service;

import com.xworkz.crud_operations.app.repository.TrainNumberRepository;

public class TrainNumberServiceImpl implements TrainNumberService {

	private TrainNumberRepository numberRepository;

	public TrainNumberServiceImpl(TrainNumberRepository numberRepository) {
		this.numberRepository = numberRepository;
	}

	@Override
	public boolean validateAndSave(int trainNumber) {

		if (trainNumber != 0 && trainNumber>293764 && trainNumber<999999) {
			System.out.println("VALID DATA");
			if (!this.numberRepository.isExist(trainNumber)) {
				System.out.println("INvoking throu repo");
				this.numberRepository.save(trainNumber);
				return true;
			} else {
				System.out.println("PLEASE SELECT OTHER");
			}

		} else {
			System.out.println("INVALID DATA");
		}

		return false;
	}

}
