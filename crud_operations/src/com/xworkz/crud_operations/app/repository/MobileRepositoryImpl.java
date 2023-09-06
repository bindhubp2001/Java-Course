package com.xworkz.crud_operations.app.repository;

public class MobileRepositoryImpl implements MobileRepository {

	private long[] numbers = new long[TOTAL];

	private int position;

	@Override
	public void save(long number) {

		if (position < TOTAL) {
			this.numbers[position] = number;
			System.out.println("Store " + number + " at position " + position);
			this.position++;
		}
	}

	@Override
	public boolean isExist(long number) {

		for (int i = 0; i < position; i++) {
			long temp = numbers[i];

			if (temp == number) {
				System.out.println("ALready Exist");
				return true;
			}
		}

		return MobileRepository.super.isExist(number);
	}

}
