package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.PrinterDTO;
import com.xworkz.newspaper.app.repository.PrinterRepository;

public class PrinterServiceImpl implements PrinterService {

	private PrinterRepository printerRepository;

	public PrinterServiceImpl(PrinterRepository printerRepository) {
		this.printerRepository = printerRepository;
	}

	@Override
	public boolean validateAndSave(PrinterDTO dto) {

		if (dto != null) {

			System.out.println("DTO IS NOT NULL..");

			String comapny = dto.getCompanyName();
			int noOfPrinters = dto.getNoOFPrinters();

			if (comapny != null && !comapny.isEmpty() && comapny.length() >= 3 && comapny.length() <= 20) {
				System.out.println("Company is Valid");
			} else {
				System.out.println("Company id INVALID");
				return false;
			}

			if (noOfPrinters != 0) {
				System.out.println("PRINTERS is Valid");
			} else {
				System.out.println("PRINTERS id INVALID");
			}

			this.printerRepository.persist(dto);
			return true;

		} else {
			System.out.println("DTO IS NULL");
		}

		return false;

	}
}
