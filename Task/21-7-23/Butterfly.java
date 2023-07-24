class Butterfly
{
	String color;
	static String scientificName;
	static int noOfWings;
	int noOfLegs;
	
	Butterfly()
	{
		this.color="Yello";
		this.noOfLegs=6;
	}
	
	void butterflyInstanceMethod()
	{
		System.out.println("Printing Instance Variable values");
		System.out.println("COLOR : "+color);
		System.out.println("NO OF LEGS : "+noOfLegs);
	}
	
	static
	{
		scientificName="Rhopalocera";
		noOfWings=4;
	}
	
	static void butterflyStaticMethod()
	{
		System.out.println("Printing Static Variable values");
		System.out.println("SCIENTIFIC NAME : "+scientificName);
		System.out.println("NO OF WINGS : "+noOfWings);
	}
}