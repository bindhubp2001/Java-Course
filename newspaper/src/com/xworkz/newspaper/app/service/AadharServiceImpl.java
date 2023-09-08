package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.AadharDTO;
import com.xworkz.newspaper.app.repository.AadharRepository;

public class AadharServiceImpl implements AadharService {

	private AadharRepository aadharRepository;

	public AadharServiceImpl(AadharRepository aadharRepository) {
		this.aadharRepository = aadharRepository;
	}

	@Override
	public boolean validateAndSave(AadharDTO aadharDTO) {

		if (aadharDTO != null) {
			System.out.println("DTO is not null");

			long number = aadharDTO.getAadharNumber();
			String language = aadharDTO.getLang();
			String state = aadharDTO.getState();

			if (number != 0) {
				System.out.println("Number is VAlid");
			} else {
				System.err.println("NUmber is Invalid");
				return false;
			}

			if (language != null && !language.isEmpty() && language.length() >= 3 && language.length() <= 20) {
				System.out.println("LAnguage is VAlid");
			} else {
				System.err.println("Language is Invalid");
				return false;
			}

			if (state != null && !state.isEmpty() && state.length() >= 3 && state.length() <= 20) {
				System.out.println("state is VAlid");
			} else {
				System.err.println("state is Invalid");
				return false;
			}

			this.aadharRepository.persistant(aadharDTO);
			return true;
		}

		return false;
	}

}
