class Soil 
{
	static String type;
	static String color;
	String use;
	int load;
	
	Soil()
	{
		this.use = "PLANTING";
		this.load = 10;
	}
	
	void soilInstanceMethod()
	{
		System.out.println("Printing Instance Variable values");
		System.out.println("USE OF SOIL : "+use);
		System.out.println("LOAD : "+load);
	}
	
	static
	{
		type="Sandy Soil";
		color="Black";
	}
	
	static void soilStaticMethod()
	{
		System.out.println("\nPrinting Static Variable values");
		System.out.println("TYPE OF SOIL : "+type);
		System.out.println("COLOR : "+color);
	}
	
	
}