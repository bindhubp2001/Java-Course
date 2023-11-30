package com.xworkz.crud_user.service;

import com.xworkz.crud_user.dto.UserDTO;

public interface UserService {
	
	boolean validateAndSave(UserDTO dto);

	default UserDTO findByName(String name) {
		return null;
	}

}
