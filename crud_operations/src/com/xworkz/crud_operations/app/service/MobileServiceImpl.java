package com.xworkz.crud_operations.app.service;

import com.xworkz.crud_operations.app.repository.MobileRepository;

public class MobileServiceImpl implements MobileService {
	
	private MobileRepository mobileRepository;
	
	public MobileServiceImpl(MobileRepository mobileRepository) {
		this.mobileRepository=mobileRepository;
	}

	@Override
	public boolean validateAndSave(long number) {
		
		if(number!=0) {
			System.out.println("VALID");
			if(!this.mobileRepository.isExist(number)) {
				System.out.println("invoke through repo");
				this.mobileRepository.save(number);
				return true;
			}
			else {
				System.err.println("Please select other");
			}
		}
		else {
			System.err.println("INVALID");
		}
		
		return false;
	}

}
