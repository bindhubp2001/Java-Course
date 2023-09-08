package com.xworkz.crud_operations.app.service;

import com.xworkz.crud_operations.app.repository.PincodeRepository;

public class PincodeServiceImpl implements PincodeService {

	private PincodeRepository pincodeRepository;

	public PincodeServiceImpl(PincodeRepository pincodeRepository) {
		this.pincodeRepository = pincodeRepository;
	}

	@Override
	public boolean validateAndSave(int pincode) {

		if (pincode != 0 && pincode>=100000 && pincode<=666666) {
			System.out.println("VALID DATA");

			if (!this.pincodeRepository.isExist(pincode)) {
				System.out.println("invoking throug repo");
				this.pincodeRepository.save(pincode);
				return true;
			} else {
				System.err.println("Please select other");
			}

		} else {
			System.err.println("INVALID DATA");
		}
		return false;

	}

}
