package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.NewPaperDTO;

public interface NewsPaperRepository {

	int TOTAL=5;
	 void save(NewPaperDTO dto);
	 
}
