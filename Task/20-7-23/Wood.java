class Wood
{
	String type;
	double density;
	double hardness;
	String color;
	boolean isFragrant;
	
	Wood()
	{
		this("Brown",4);
		System.out.println("Calling 1st Constrictor");
		
	}
	
	Wood(String color,double hardness)
	{
		this("Red",5,true,100,"OAK");
		System.out.println("Calling 2nd Constrictor");
	}
	
	Wood(String type,String color,boolean isFragrant)
	{
		this();
		System.out.println("Calling 3rd Constrictor");
	}
	
	Wood(String color,double hardness,boolean isFragrant,double density,String type)
	{
		this.type=type;
		this.density=density;
		this.hardness=hardness;
		this.color=color;
		this.isFragrant=isFragrant;
		System.out.println("Calling 4th  Constrictor");
	}
	
	Wood(double density)
	{
		this("SANDLE","DARK BROWN",false);
		System.out.println("Calling 5th Constrictor");
	}
}