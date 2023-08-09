package in.examples.overload_override.boot;

import in.examples.overload_override.app.Street;
import in.examples.overload_override.app.StreetRoad;

public class StreetMain {

	public static void main(String[] args) {
		Street street = new Street();
		street.street();
		street.street("Shivanagar");
		street.street("Shivanagar",3000);
		street.street("Shivanagar",3000,"Karnataka");
		street.street("Shivanagar",3000,"Karnataka","Shivajinagar");
		street.street("Shivanagar",3000,"Karnataka","Shivajinagar",2000);
		
		System.out.println("\n-------Override methods using PARENT class ref------------------\n");

		
		Street street2 = new StreetRoad();
		street2.street();
		street2.street("Rajajinagar");
		street2.street("Rajajinagar",4000);
		street2.street("Rajajinagar",4000,"Karnataka");
		street2.street("Rajajinagar",4000,"Karnataka","Bashamsham circle");
		street2.street("Rajajinagar",4000,"Karnataka","Bashamsham circle",3000);
		
		System.out.println("\n-------Override methods using SUB class ref------------------\n");

		StreetRoad street3 = new StreetRoad();
		street3.street();
		street3.street("Vijaynagar");
		street3.street("Vijaynagar",9000);
		street3.street("Vijaynagar",9000,"Karnataka");
		street3.street("Vijaynagar",9000,"Karnataka","Maruthimandir");
		street3.street("Vijaynagar",9000,"Karnataka","Maruthimandir ",9000);
		
	}

}
