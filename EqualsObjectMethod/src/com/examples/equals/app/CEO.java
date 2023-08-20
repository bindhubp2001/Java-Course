package com.examples.equals.app;

public class CEO {
	private String name;
	private String company;
	private boolean hasCar;
	private int expernece;
	private String location;
	private double salary;

	public CEO() {

	}

	public CEO(String name, String company, boolean hasCar, int expernece, String location, double salary) {
		super();
		this.name = name;
		this.company = company;
		this.hasCar = hasCar;
		this.expernece = expernece;
		this.location = location;
		this.salary = salary;
	}

	@Override
	public String toString() {

		return name + "\n" + company + "\n" + hasCar + "\n" + location + "\n" + expernece + "\n" + salary;
	}

	@Override
		public boolean equals(Object obj) {
			if(obj!=null)
				System.out.println("Object is Not Null,,,,Can Compare");
			
				if(obj instanceof CEO )
					System.out.println("object is instance of CEO");
				
				    CEO ceo=(CEO)obj; 
				
					if (ceo.name.equals(name) && ceo.salary == salary)
						return true;
			
			return false;
		}
}
