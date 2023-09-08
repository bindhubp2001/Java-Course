package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.NewPaperDTO;
import com.xworkz.newspaper.app.repository.NewsPaperRepository;

public class NewsPaperServiceImpl implements NewsPaperService {
	
	private NewsPaperRepository newsPaperRepository;
	
	public NewsPaperServiceImpl(NewsPaperRepository newsPaperRepository) {
		this.newsPaperRepository=newsPaperRepository;
	}

	@Override
	public boolean validateAndSave(NewPaperDTO dto) {
		
		if(dto!=null) {
			System.out.println("DTO IS NOT NULL");
			
			String name=dto.getName();
			String publisher=dto.getPublisher();
			int pages=dto.getPages();
			
			if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20) {
				System.out.println("Name is valid");
			}
			else {
				System.out.println("Name is invalid");
				return false;
			}
			
			if(publisher!=null && !publisher.isEmpty() && publisher.length()>=3 && publisher.length()<=20) {
				System.out.println("publisher is valid");
			}
			else {
				System.out.println("publisher is invalid");
				return false;
			}
			
			if(pages!=0) {
				System.out.println("publisher is valid");
			}
			else {
				System.out.println("publisher is invalid");
				return false;
			}
			
			
			this.newsPaperRepository.save(dto);
		}
		else {
			System.err.println("DTO IS NULL");
		}
		
		return false;
	}

}
