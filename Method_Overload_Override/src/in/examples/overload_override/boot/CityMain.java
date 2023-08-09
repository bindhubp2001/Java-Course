package in.examples.overload_override.boot;

import in.examples.overload_override.app.City;
import in.examples.overload_override.app.Town;

public class CityMain {

	public static void main(String[] args) {
		City city = new City();
		city.city();
		city.city("Bengalore");
		city.city("Bengalore",true);
		city.city("Bengalore",true,"Bengalore");
		city.city("Bengalore",true,"Bengalore","Karnataka");
		city.city("Bengalore",true,"Bengalore","Karnataka",true);
		
		System.out.println("\n-------Override methods using PARENT class ref------------------\n");
		
		City city2 = new Town();
		city2.city();
		city2.city("davanagere");
		city2.city("davanagere",true);
		city2.city("davanagere",false,"davanagere");
		city2.city("davanagere",true,"davanagere","Karnataka");
		city2.city("davanagere",false,"davanagere","Karnataka",false);
		
		System.out.println("\n-------Override methods using SUB class ref------------------\n");
		
		Town city3 = new Town();
		city3.city();
		city3.city("Mysore");
		city3.city("Mysore",false);
		city3.city("Mysore",false,"Mysore");
		city3.city("Mysore",true,"Mysore","Karnataka");
		city3.city("Mysore",false,"Mysore","Karnataka",true);
		
		

	}

}
