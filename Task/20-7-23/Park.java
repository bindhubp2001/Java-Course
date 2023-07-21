class Park
{
	String name;
	String place;
	int noOfPeople;
	int noOfSeatArrangement;
	boolean hasGamingEquipments;
	boolean hasExerciseEquipments;
	boolean hasParkingArea;
	char isOpen;
	char isClose;
	
	Park()
	{
		this("RAJ","GOA",90,100,true,true,true,'Y','N');
		System.out.println("CALLING 1ST CONSTRUCTOR");
	}
	
	Park(String name)
	{
		this('N');
		System.out.println("CALLING 2ND CONSTRUCTOR");
	}
	
	Park(boolean hasExerciseEquipments,boolean hasParkingArea,boolean hasGamingEquipments)
	{
		this(80);
		System.out.println("CALLING 3RD CONSTRUCTOR");
	}
	
	Park(char isClose)
	{
		this();
		System.out.println("CALLING 4TH CONSTRUCTOR");
	}
	
	Park(String name,char isOpen)
	{
		this(true,true,false);
		System.out.println("CALLING 5TH CONSTRUCTOR");
	}
	
	Park(String name,boolean hasParkingArea)
	{
		this("VISHNU");
		System.out.println("CALLING 6TH CONSTRUCTOR");
	}
	
	Park(String place,int noOfPeople)
	{
		this("AJ",true);
		System.out.println("CALLING 7TH CONSTRUCTOR");
	}
	
	Park(int noOfSeatArrangement)
	{
		this("RJ",100);
		System.out.println("CALLING 8TH CONSTRUCTOR");
	}
	
	Park(String name,String place,int noOfPeople,int noOfSeatArrangement,boolean hasExerciseEquipments,boolean hasGamingEquipments,boolean hasParkingArea,char isOpen,char isClose)
	{
		this.name=name;
		this.place=place;
		this.noOfPeople=noOfPeople;
		this.noOfSeatArrangement=noOfSeatArrangement;
		this.hasExerciseEquipments= hasExerciseEquipments;
		this.hasGamingEquipments=hasGamingEquipments;
		this.hasParkingArea=hasParkingArea;
		this.isClose=isClose;
		this.isOpen=isOpen;
		System.out.println("CALLING 9TH CONSTRUCTOR");
	}
}