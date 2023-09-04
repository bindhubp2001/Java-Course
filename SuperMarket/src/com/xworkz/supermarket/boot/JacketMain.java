package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.app.repository.JacketRepository;
import com.xworkz.supermarket.app.repositoryImpl.JacketrepositoryImpl;

public class JacketMain {

	public static void main(String[] args) {
		JacketRepository jacketRepository = new JacketrepositoryImpl();

		jacketRepository.save("Denim");
		jacketRepository.save("Leather");
		jacketRepository.save("RainCoat");
		jacketRepository.save("Woolen");
		jacketRepository.save("Jeans");
		jacketRepository.save("Cotton");
		jacketRepository.save("Polyster");
		jacketRepository.save("Woolen");
		jacketRepository.save("Wooodie");
		jacketRepository.save("Coat");
		jacketRepository.save("Denim");
	}

}
