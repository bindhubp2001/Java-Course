package com.xworkz.crud_user.boot;

import com.xworkz.crud_user.dto.UserDTO;
import com.xworkz.crud_user.repository.UserRepository;
import com.xworkz.crud_user.repository.UserRepositoryImpl;
import com.xworkz.crud_user.service.UserService;
import com.xworkz.crud_user.service.UserServiceImpl;

public class UserMain {

	public static void main(String[] args) {
		UserDTO userDTO = new UserDTO("Bindhu",24,476547d,"Cognizant","SD",false,"Female","Bng","karnataka","India");

		

		UserRepository userRepository = new UserRepositoryImpl();

		UserService userService = new UserServiceImpl(userRepository);

		userService.validateAndSave(userDTO);
		System.out.println();
		userService.validateAndSave(userDTO);

		 UserDTO present=userRepository.findByName("Ram");
		 System.out.println("FOUND"+present);

	}

}
