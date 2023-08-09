package in.examples.overload_override.boot;

import in.examples.overload_override.app.FireStation;
import in.examples.overload_override.app.PoliceStation;

public class PoliceStationMain {

	public static void main(String[] args) {
		
		PoliceStation policeStation1 = new PoliceStation();//override with Parent class ref
		policeStation1.station();
		policeStation1.station("Mejastic station");
		policeStation1.station("Mejastic station","magadi");
		policeStation1.station("Mejastic station","magadi",30);
		policeStation1.station("Mejastic station","magadi",30,"Karnataka");
		policeStation1.station("Mejastic station","magadi",30,"Karnataka",true);
		
		System.out.println("..........override using super class ref............");
		
		PoliceStation policeStation = new FireStation();//override with Parent class ref
		policeStation.station();
		policeStation.station("Magadi station");
		policeStation.station("Magadi station","magadi");
		policeStation.station("Magadi station","magadi",10);
		policeStation.station("Magadi station","magadi",10,"Karnataka");
		policeStation.station("Magadi station","magadi",10,"Karnataka",true);
		
		System.out.println("..........override using Child class ref............");
		
		FireStation policeStation2 = new FireStation();//override with sub class ref
		policeStation2.station();
		policeStation2.station("Vijaynagar");
		policeStation2.station("Vijaynagar","Vijaynagar");
		policeStation2.station("Vijaynagar","Vijaynagar",20);
		policeStation2.station("Vijaynagar","Vijaynagar",20,"Karnataka");
		policeStation2.station("Vijaynagar","Vijaynagar",20,"Karnataka",false);
	}

}

