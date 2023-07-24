class Bureau
{
	
	static String material;
	static int noOfLegs;
	int noOfDoors;
	String purpose;
	
	Bureau(int noOfDoors,String purpose)
	{
		this.noOfDoors=noOfDoors;
		this.purpose=purpose;
	}
	
	void bureauInstanceMethod()
	{
		System.out.println("Printing Instance Variable Values");
		System.out.println("NO OF DOORS ARE : "+noOfDoors);
		System.out.println("PURPOSE : "+purpose);
	}
	
	static void bureaStaticMethod()
	{
		System.out.println("\nPrinting Static Variable Values");
		System.out.println("NO of LEGS are : "+noOfLegs);
		System.out.println("Material is : "+material);
	}
	
	static
	{
		noOfLegs=4;
		material="WOOD";
	}
}