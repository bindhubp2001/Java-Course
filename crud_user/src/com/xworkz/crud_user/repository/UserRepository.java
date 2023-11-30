package com.xworkz.crud_user.repository;

import com.xworkz.crud_user.dto.UserDTO;

public interface UserRepository {
	
	int TOTAL = 10;

	void persist(UserDTO dto);

	default UserDTO findByName(String name) {
		return null;
	}

}
