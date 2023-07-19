class Boat{
	String name;
    int length;
    int capacity;
	
	
	
	Boat()
	{
		System.out.println("Calling Dafault Constuuctor");
		System.out.println("NAME: "+this.name);
		System.out.println("LENGTH : "+this.length);
		System.out.println("CAPACITY : "+this.capacity);
		this.name="TITANIC";
		this.length=1000;
		this.capacity=500;
		
	}
	Boat(String name,int length,int capacity)
	{
		System.out.println("Calling Parameterized Constuuctor");
		this.name=name;
		this.length=length;
		this.capacity=capacity;
	}
	
}