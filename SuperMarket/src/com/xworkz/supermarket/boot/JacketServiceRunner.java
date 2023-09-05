package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.JacketRepository;
import com.xworkz.supermarket.app.repositoryImpl.JacketrepositoryImpl;
import com.xworkz.supermarket.app.service.JacketService;
import com.xworkz.supermarket.app.serviceImpl.JacketServiceImpl;

public class JacketServiceRunner {

	public static void main(String[] args) {
		JacketRepository jacketRepository=new JacketrepositoryImpl();
		
		JacketService jacketService=new JacketServiceImpl(jacketRepository);
		jacketService.validateAndSave(" Denim");
		jacketService.validateAndSave("");
		jacketService.validateAndSave(null);

	}

}
