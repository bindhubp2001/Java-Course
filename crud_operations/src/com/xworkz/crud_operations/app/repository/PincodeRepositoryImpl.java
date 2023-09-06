package com.xworkz.crud_operations.app.repository;

public class PincodeRepositoryImpl implements PincodeRepository {

	private int[] pincodes = new int[TOTAL_CODES];
	private int position;

	@Override
	public void save(int pincode) {
		if (position < TOTAL_CODES) {
			this.pincodes[position] = pincode;
			System.out.println("Store pincode " + pincode + " at position " + position);
			this.position++;
		} else {
			System.err.println("DS is Full,,Cannot Store...");
		}

	}

	@Override
	public boolean isExist(int pincode) {
		for (int i = 0; i <= position; i++) {
			int temp = pincodes[i];
			if (temp != 0 && temp == pincode) {
				System.out.println("pincode already exist");
				return true;
			}

		}
		return PincodeRepository.super.isExist(pincode);
	}

}
