package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.NewPaperDTO;
import com.xworkz.newspaper.app.repository.NewsPaperRepository;
import com.xworkz.newspaper.app.repository.NewsPaperRepositoryImpl;
import com.xworkz.newspaper.app.service.NewsPaperService;
import com.xworkz.newspaper.app.service.NewsPaperServiceImpl;

public class NewsPaperRunner {

	public static void main(String[] args) {
		
		NewsPaperRepository newsPaperRepository=new NewsPaperRepositoryImpl();
		
		NewsPaperService newsPaperService=new NewsPaperServiceImpl(newsPaperRepository);
		
		NewPaperDTO dto=new NewPaperDTO("Hindustani","AMAR",8);
		NewPaperDTO dto2=new NewPaperDTO("Hindustani",null,8);
		
		newsPaperService.validateAndSave(dto);
		System.out.println();
		newsPaperService.validateAndSave(dto2);
		System.out.println();

		newsPaperService.validateAndSave(null);
		

	}

}
