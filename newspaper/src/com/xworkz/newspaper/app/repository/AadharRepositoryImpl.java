package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.AadharDTO;

public class AadharRepositoryImpl implements AadharRepository {

	private AadharDTO[] dtos = new AadharDTO[TOTAL];
	private int position;

	@Override
	public void persistant(AadharDTO dto) {

		if (position < TOTAL) {
			this.dtos[position] = dto;
			System.out.println(dto + " stored at position " + position);
			this.position++;
		}

		else {
			System.err.println("STORAGE IS FULL CANNOT STORE FURTHER");
		}

	}

}
