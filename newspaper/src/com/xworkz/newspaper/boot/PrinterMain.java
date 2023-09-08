package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.PrinterDTO;
import com.xworkz.newspaper.app.repository.PrinterRepository;
import com.xworkz.newspaper.app.repository.PrinterRepositoryImpl;
import com.xworkz.newspaper.app.service.PrinterService;
import com.xworkz.newspaper.app.service.PrinterServiceImpl;

public class PrinterMain {

	public static void main(String[] args) {

		PrinterRepository printerRepository = new PrinterRepositoryImpl();

		PrinterService printerService = new PrinterServiceImpl(printerRepository);

		PrinterDTO dto = new PrinterDTO(5, "CANON");

		printerService.validateAndSave(dto);

	}

}
