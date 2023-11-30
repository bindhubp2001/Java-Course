package com.xworkz.appp;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.app.dto.GameDTO;

public class GameRunner {

	public static void main(String[] args) {
		
		GameDTO dto=new GameDTO(1, "Cricket", 22, 20, LocalDate.of(2023, 1, 3), "India", "Australia", 2.30);
		GameDTO dto1=new GameDTO(2, "Soccer", 14, 5, LocalDate.of(2023, 5, 3), "India", "Nepal", 20.0);
		GameDTO dto2=new GameDTO(3, "Chess", 2, 10, LocalDate.of(2023, 1, 4), "Anand", "Shivam", 1.30);
		GameDTO dto3=new GameDTO(4, "Batmiton", 4, 21, LocalDate.of(2023, 10, 2), "India", "Australia", 30.0);
		GameDTO dto4=new GameDTO(5, "Relay", 16,2, LocalDate.of(2023, 11, 30), "India", "Australia", 15.0);
		
		Comparator<GameDTO> id = (t1,t2) -> t1.getId().compareTo(t2.getId()) ;
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(id).forEach(i -> System.out.println(i));
		System.out.println("----------------");
		
		Comparator<GameDTO> id2 = (t1,t2) -> t2.getId().compareTo(t1.getId()) ;
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(id2).forEach(i -> System.out.println(i));
		System.out.println("----------------");
		
		//name in asc
		Comparator<GameDTO> name = (t1,t2) -> t1.getName().compareTo(t2.getName());
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(name).forEach(n -> System.out.println(n));
		System.out.println("----------------");
		
		//name in Desc
		Comparator<GameDTO> name1 = (t1,t2) -> t2.getName().compareTo(t1.getName());
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(name1).forEach(n -> System.out.println(n));
		System.out.println("----------------");
		
		//Points in Asc
		Comparator<GameDTO> point = (t1,t2) -> t1.getPoints().compareTo(t2.getPoints());
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(point).forEach(n -> System.out.println(n));
		System.out.println("----------------");
				
		//Points in Desc
		Comparator<GameDTO> point1 = (t1,t2) -> t2.getPoints().compareTo(t1.getPoints());
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(point1).forEach(n -> System.out.println(n));
		System.out.println("----------------");
		
		//Date in Asc
		Comparator<GameDTO> date = (t1,t2) -> t1.getEventDate().compareTo(t2.getEventDate());
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(date).forEach(n -> System.out.println(n));
		System.out.println("----------------");
						
		//Date in Desc
		Comparator<GameDTO> date1 = (t1,t2) -> t2.getEventDate().compareTo(t1.getEventDate());
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(date1).forEach(n -> System.out.println(n));
		System.out.println("----------------");
		
		//name and point in asc
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(name.thenComparing(point)).forEach(n -> System.out.println(n));
		System.out.println("----------------");
		
		//name point date in asc
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(name.thenComparing(point).thenComparing(date)).forEach(n -> System.out.println(n));
		System.out.println("----------------");
		
		//duration in desc
		Comparator<GameDTO> duration = (t1,t2) -> t2.getDuration().compareTo(t1.getDuration());
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(duration).forEach(n -> System.out.println(n));
		System.out.println("----------------");
		
		//duration date id
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(duration.thenComparing(date1).thenComparing(id2)).forEach(n -> System.out.println(n));
		System.out.println("----------------");
		
		//sort winner in asc 
		Comparator<GameDTO> winner = (t1,t2) -> t1.getWinner().compareTo(t2.getWinner());
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(winner).forEach(n -> System.out.println(n));
		System.out.println("----------------");
		
		//winner in desc
		Comparator<GameDTO> winner1 = (t1,t2) -> t2.getWinner().compareTo(t1.getWinner());
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(winner1).forEach(n -> System.out.println(n));
		System.out.println("----------------");
		
		//runner in asc
		Comparator<GameDTO> runner = (t1,t2) -> t1.getRunner().compareTo(t2.getRunner());
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(runner).forEach(n -> System.out.println(n));
		System.out.println("----------------");
		
		//runner in desc
		Comparator<GameDTO> runner1 = (t1,t2) -> t2.getRunner().compareTo(t1.getRunner());
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(runner1).forEach(n -> System.out.println(n));
		System.out.println("----------------");
		
		Collection<GameDTO> games = Stream.of(dto,dto1,dto2,dto3,dto4).collect(Collectors.toList());
		
		/*Comparator<GameDTO> temp = (t1, t2) -> t1.getName().compareTo(t2.getName());
		Comparator<GameDTO> namePoints = temp.thenComparing((t1, t2) -> t1.getPoints().compareTo(t2.getPoints()));
		games.stream().sorted(namePoints).forEach(p -> System.out.println(p));
		
		
		System.err.println("------sorting based on name,points and event date----");
		Comparator<GameDTO> temp1 = (t1, t2) -> t1.getName().compareTo(t2.getName());
		Comparator<GameDTO> temp2 = temp1.thenComparing((t1, t2) -> t1.getPoints().compareTo(t2.getPoints()));
		Comparator<GameDTO> namePointsDate = temp2
				.thenComparing((t1, t2) -> t1.getEventDate().compareTo(t2.getEventDate()));
		games.stream().sorted(namePointsDate).forEach(npd -> System.out.println(npd));*/

		System.err.println("collecting only using names");
		Collection<String> gameNames = games.stream().map(n -> n.getName()).collect(Collectors.toList());
		gameNames.stream().forEach(c -> System.out.println(c));
		
		System.err.println("collecting only duration in descending");
		Collection<GameDTO> durationCollection = games.stream().sorted(duration).collect(Collectors.toList());
		durationCollection.stream().sorted(duration).map(c -> c.getDuration()).forEach(c -> System.out.println(c));
		
		System.err.println("collecting winner name and sort in descending");
		
		Collection<GameDTO> nameDuration = games.stream().sorted(winner1).collect(Collectors.toList());
		nameDuration.stream().map(c -> c.getWinner()).forEach(c -> System.out.println(c));

		System.err.println("collecting only using runner up name");
		Collection<String> runnerUp = games.stream().map(n -> n.getRunner()).collect(Collectors.toList());
		runnerUp.stream().forEach(c -> System.out.println(c));
		
		System.err.println("find game by name");
		games.stream().filter((c) -> c.getWinner().equals("India")).forEach(c -> System.out.println(c.getName()));
		
		System.err.println("find game by event date");
		games.stream().filter((c) -> c.getEventDate().equals(LocalDate.of(2023, 5, 3))).forEach(c -> System.out.println(c.getName()));

		System.err.println("find game by event date");
		games.stream().filter((c) -> c.getEventDate().equals(LocalDate.of(2023, 1 ,3)))
				.forEach(c -> System.out.println(c.getName()));

		System.err.println("find Winner by game");
		games.stream().filter((c) -> c.getName().equals("Soccer")).forEach(c -> System.out.println(c.getWinner()));

		System.err.println("find point by game");
		games.stream().filter((c) -> c.getName().equals("Chess")).forEach(c -> System.out.println(c.getPoints()));
		
		
		System.err.println("sorting with both name and points ascending");
		Comparator<GameDTO> temp = (t1, t2) -> t1.getName().compareTo(t2.getName());
		Comparator<GameDTO> namePoints = temp.thenComparing((t1, t2) -> t1.getPoints().compareTo(t2.getPoints()));
		games.stream().sorted(namePoints).forEach(p -> System.out.println(p));
		
		System.err.println("sorting based on name,points and event date");
		Comparator<GameDTO> temp1 = (t1, t2) -> t1.getName().compareTo(t2.getName());
		Comparator<GameDTO> temp2 = temp1.thenComparing((t1, t2) -> t1.getPoints().compareTo(t2.getPoints()));
		Comparator<GameDTO> namePointsDate = temp2
				.thenComparing((t1, t2) -> t1.getEventDate().compareTo(t2.getEventDate()));
		games.stream().sorted(namePointsDate).forEach(npd -> System.out.println(npd));

		System.err.println("sorting based on duration,date and id");
		Comparator<GameDTO> temp3 = (t1, t2) -> t1.getDuration().compareTo(t2.getDuration());
		Comparator<GameDTO> temp4 = temp3.thenComparing((t1, t2) -> t1.getEventDate().compareTo(t2.getEventDate()));
		Comparator<GameDTO> durationDateId = temp4.thenComparing((t1, t2) -> t1.getId().compareTo(t2.getId()));
		games.stream().sorted(durationDateId).forEach(npd -> System.out.println(npd));
	}

}
