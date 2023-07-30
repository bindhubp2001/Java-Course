package com.xworkz.association.app6;

public class Hospital {
 public Docter docter;
 public Nurse nurse;
 public Patient patient;
 
 public void medicin()
 {
	 System.out.println("MEDICAL SHOP");
	 if(docter!=null)
		{
			this.docter.operates();
		}
	else 
		{
			System.err.println("Cannot Invoke");
		}
	 if(nurse!=null)
		{
			this.nurse.dressing();
		}
	else 
		{
			System.err.println("Cannot Invoke");
		}
	 if(patient!=null)
		{
			this.patient.sick();
		}
	else 
		{
			System.err.println("Cannot Invoke");
		}
 }
 public void manage()
 {
	 System.out.println("HOSPITAL MANAGEMENT");
	 if(docter!=null)
		{
			this.docter.prescription();
		}
	else 
		{
			System.err.println("Cannot Invoke");
		}
	 if(nurse!=null)
		{
			this.nurse.inject();
		}
	else 
		{
			System.err.println("Cannot Invoke");
		}
	 if(patient!=null)
		{
			this.patient.undegoDiognosis();
		}
	else 
		{
			System.err.println("Cannot Invoke");
		}
 }
 
}
