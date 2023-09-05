package com.xworkz.supermarket.app.serviceImpl;

import com.xworkz.supermarket.app.repository.JacketRepository;

import com.xworkz.supermarket.app.service.JacketService;

public class JacketServiceImpl implements JacketService{
	
	private JacketRepository jacketRepository;
	
	public JacketServiceImpl(JacketRepository jacketRepository) {
		this.jacketRepository=jacketRepository;
	}

	@Override
	public boolean validateAndSave(String cloth) {
		if (cloth != null && !cloth.isEmpty() && cloth.length() >=3 && cloth.length() <= 20) {
			System.out.println("Data is valid");
			this.jacketRepository.save(cloth);
		} else {
			System.err.println("Data is invalid");
		}
		return false;
	}

}
