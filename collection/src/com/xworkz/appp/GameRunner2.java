package com.xworkz.appp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.xworkz.app.dto.GameDTO;

public class GameRunner2 {

	public static void main(String[] args) {

		GameDTO dto = new GameDTO(1, "Cricket", 22, 20, LocalDate.of(2023, 1, 3), "India", "Australia", 2.30);
		GameDTO dto1 = new GameDTO(2, "Soccer", 14, 5, LocalDate.of(2023, 5, 3), "India", "Nepal", 20.0);
		GameDTO dto2 = new GameDTO(3, "Chess", 2, 10, LocalDate.of(2023, 1, 4), "Anand", "Shivam", 1.30);
		GameDTO dto3 = new GameDTO(4, "Batmiton", 4, 21, LocalDate.of(2023, 10, 2), "India", "Australia", 30.0);
		GameDTO dto4 = new GameDTO(5, "Relay", 16, 2, LocalDate.of(2023, 11, 30), "India", "Australia", 15.0);

		Collection<GameDTO> collection = new ArrayList<GameDTO>();
		collection.add(dto4);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto);
		collection.add(dto3);
		for (GameDTO gameDTO : collection) {
			if (gameDTO.getName().equals("Cricket")) {
				System.out.println(gameDTO);
			}
		}
		System.out.println("====");
		Predicate<GameDTO> predicate = (gameDTO) -> {
			return gameDTO.getName().equals("Soccer");
		};
		collection.stream().filter(predicate).forEach((g) -> System.out.println(g));
		// filter,sorted,map,forEach,flatMap,findFirst,findLast
//mykong 
		// head first servlet & jsp
		collection.stream().map(gameDto -> gameDto.getName()).forEach(name -> System.out.println(name));
	}

}
