package com.xworkz.crud_operations.app.repository;

public class TrainNumberRepositoryImpl implements TrainNumberRepository {

	private int[] trainNumbers = new int[TOTAL];

	private int pos;

	@Override
	public void save(int trainNumber) {

		if (pos < TOTAL) {
			this.trainNumbers[pos] = trainNumber;
			System.out.println("Store traine number " + trainNumber + " at position " + this.pos);
			this.pos++;
		}

	}

	@Override
	public boolean isExist(int trainNumber) {
		for (int i = 0; i < pos; i++) {
			int temp = trainNumbers[i];
			if (temp == trainNumber) {
				System.err.println("pincode already exist");
				return true;
			}
		}
		return TrainNumberRepository.super.isExist(trainNumber);
	}

}
