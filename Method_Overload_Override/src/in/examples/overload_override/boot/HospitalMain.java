package in.examples.overload_override.boot;

import in.examples.overload_override.app.ColumbiaHospital;
import in.examples.overload_override.app.Hospital;

public class HospitalMain {

	public static void main(String[] args) {
		
		Hospital hospital=new Hospital(); // printing overloading methods in parent class
		
		hospital.treats();
		hospital.treats(6000.0);
		hospital.treats(200);
		hospital.treats("KIMS");
		hospital.treats("Ram","Cancer");
		hospital.treats("Victoria", "Cold", 500);
		
		System.out.println("---------------------------");
		
		Hospital hospital2=new ColumbiaHospital();// Achive override through parent class ref
		
		hospital2.treats();
		hospital2.treats(8000.0);
		hospital2.treats(900);
		hospital2.treats("JAYADEVA");
		hospital2.treats("KARAN","FEWER");
		hospital2.treats("JAYADEVA", "HEADACHE", 200);
		
		System.out.println("---------------------------");// Achive override through Child class ref
		
		ColumbiaHospital hospital3=new ColumbiaHospital();
		
		hospital3.treats();
		hospital3.treats(6000.0);
		hospital3.treats(200);
		hospital3.treats("KIMS");
		hospital3.treats("RAVI","Viral Fewer");
		hospital3.treats("SS", "HAND PAIN", 900);

	}

}
