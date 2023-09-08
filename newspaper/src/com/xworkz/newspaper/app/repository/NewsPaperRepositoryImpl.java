package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.NewPaperDTO;

public class NewsPaperRepositoryImpl implements NewsPaperRepository {

	private NewPaperDTO[] dtos = new NewPaperDTO[TOTAL];
	private int index;

	@Override
	public void save(NewPaperDTO dto) {

		if (index < TOTAL) {
			this.dtos[index] = dto;
			System.out.println(dto + " store at position " + this.index);
			this.index++;
		}
		else {
			System.err.println("DS IDS FULL ,, NOT STORE FURTHER");
		}

	}

}
