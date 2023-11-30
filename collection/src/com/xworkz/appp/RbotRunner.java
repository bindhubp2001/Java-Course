package com.xworkz.appp;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.app.dto.RobotDTO;

public class RbotRunner {
	public static void main(String[] args) {
		
	
	RobotDTO robot1=new RobotDTO("Iron", 8, 8, "ServeThings");
	RobotDTO robot2=new RobotDTO("Plastic", 15, 8, "ReadNews");
	RobotDTO robot3=new RobotDTO("Steel", 8, 12, "GiveTicket");
	RobotDTO robot4=new RobotDTO("Gold", 10, 8, "Announce");
	RobotDTO robot5=new RobotDTO("Rubber", 8, 6, "Cleaning");
	
	Collection<RobotDTO> robots = new LinkedList<RobotDTO>();
	
	robots.add(robot1);
	robots.add(robot2);
	robots.add(robot3);
	robots.add(robot4);
	robots.add(robot5);
	
	robots.stream().sorted().forEach(r -> System.out.println(r));
	
	}
}
