package in.examples.overload_override.boot;

import in.examples.overload_override.app.NationalPark;
import in.examples.overload_override.app.Zoo;

public class ZooMain {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.zoo();
		zoo.zoo("Mysore Zoo");
		zoo.zoo("Mysore Zoo",10);
		zoo.zoo("Mysore Zoo",10,6);
		zoo.zoo("Mysore Zoo",10,6,"Karnatak");
		zoo.zoo("Mysore Zoo",10,6,"Karnatak",true);
		
		System.out.println("\n-------Override methods using PARENT class ref------------------\n");
		
		Zoo zoo2 = new NationalPark();
		zoo2.zoo();
		zoo2.zoo("Manglore zoo");
		zoo2.zoo("Manglore Zoo",11);
		zoo2.zoo("Manglore Zoo",11,5);
		zoo2.zoo("Manglore Zoo",11,5,"Karnatak");
		zoo2.zoo("Manglore Zoo",11,5,"Karnatak",true);
		
		System.out.println("\n-------Override methods using SUB class ref------------------\n");

		NationalPark zoo3 = new NationalPark();
		zoo3.zoo();
		zoo3.zoo("Mandya zoo");
		zoo3.zoo("Mandya Zoo",15);
		zoo3.zoo("Mandya Zoo",15,4);
		zoo3.zoo("Mandya Zoo",15,4,"Karnatak");
		zoo3.zoo("Mandya Zoo",15,4,"Karnatak",true);
		
	}

}
