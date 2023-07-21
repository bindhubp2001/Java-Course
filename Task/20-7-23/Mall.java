class Mall
{
	
	String name;
	String location;
	int numberOfStores;
	int parkingCapacity;
	boolean hasFoodCourt;
	boolean hasMovieZone;
	boolean hasGamingZone;
	
	Mall()
	{
		this("LULU","RAJAJINAGAR");
		System.out.println("INVOKING 1ST CONSTUCTOR");
	}
	
	Mall(String name,int parkingCapacity)
	{
		this();
		System.out.println("INVOKING 2ND CONSTUCTOR");
	}
	
	Mall(String name,String location)
	{
		this("ORIAN","MAHALAKSHMI LAYOUT",500,5000,true,false,true);
		System.out.println("INVOKING 3RD CONSTUCTOR");
	}
	
	Mall(String name,boolean hasFoodCourt)
	{
		this(true,true,true);
		System.out.println("INVOKING 4TH CONSTUCTOR");
	}
	
	Mall(String name,String location,int numberOfStores,int parkingCapacity,boolean hasFoodCourt,boolean hasMovieZone,boolean hasGamingZone)
	{
		this.name=name;
		this.location=location;
		this.numberOfStores=numberOfStores;
		this.parkingCapacity=parkingCapacity;
		this.hasFoodCourt=hasFoodCourt;
		this.hasMovieZone=hasMovieZone;
		this.hasGamingZone=hasGamingZone;
		System.out.println("INVOKING 5TH CONSTUCTOR");
	}
	
	Mall(boolean hasFoodCourt,boolean hasGamingZoneCourt,boolean hasMovieZone)
	{
		this("CENTRAL MALL",true,200);
		System.out.println("INVOKING 6TH CONSTUCTOR");
	}
	
	Mall(String name,boolean hasFoodCourt,int numberOfStores)
	{
		this("GT MALL",1500);
		System.out.println("INVOKING 7TH CONSTUCTOR");
	}
	
	
}