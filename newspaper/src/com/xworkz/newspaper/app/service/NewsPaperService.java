package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.NewPaperDTO;

public interface NewsPaperService {
	boolean validateAndSave(NewPaperDTO dto);
}
