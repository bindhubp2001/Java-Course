package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.DocterDTO;

public class DocterRepositoryImpl implements DocterRepository {

	private DocterDTO[] docterDTOs = new DocterDTO[TOTAL];
	private int position;

	@Override
	public void persist(DocterDTO docterDTO) {

		if (position < TOTAL) {
			this.docterDTOs[position] = docterDTO;
			System.out.println(docterDTO + " Store at position " + this.position);
			this.position++;
		} else {
			System.err.println("DATA SRORE IS FULL,,CANNOT PERSIST..");
		}

	}

}
