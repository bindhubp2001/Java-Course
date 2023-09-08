package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.DocterDTO;
import com.xworkz.newspaper.app.repository.DocterRepository;

public class DocterServiceImpl implements DocterService {

	private DocterRepository docterRepository;

	public DocterServiceImpl(DocterRepository docterRepository) {
		this.docterRepository = docterRepository;
	}

	@Override
	public boolean validateAndSave(DocterDTO docterDTO) {

		if (docterDTO != null) {
			System.out.println("DTO IS NOT NULL...");

			String name = docterDTO.getName();
			int age = docterDTO.getAge();

			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
				System.out.println("NAME id VALID");
			} else {
				System.err.println("NAME is INVALID");
				return false;
			}

			if (age != 0) {
				System.out.println("AGE id VALID");
			} else {
				System.err.println("AGE is INVALID");
				return false;
			}

			this.docterRepository.persist(docterDTO);
			return true;
		}

		return false;
	}

}
