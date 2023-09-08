package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.PrinterDTO;

public class PrinterRepositoryImpl implements PrinterRepository {

	private PrinterDTO[] dtos = new PrinterDTO[TOATL];
	private int position;

	@Override
	public void persist(PrinterDTO dto) {

		if (position < TOATL) {
			this.dtos[position] = dto;
			System.out.println(dto + " Stored at position " + this.position);
			this.position++;

		}

		else {
			System.err.println("DATA STORE IS FULL,,, CANNOT STORE FURTHER..");
		}

	}
}
