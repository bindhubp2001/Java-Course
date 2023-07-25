class Camera{

	static void click(String location,String date, int howManyPeople,int resolution, String clarity, String cameraManName){
			
		System.out.println("\n Location : "+location);
		System.out.println("Date: "+date);
		System.out.println("People in frame : "+howManyPeople);
		System.out.println("Resolutiion : "+resolution);
		System.out.println("Clarity : "+clarity);
		System.out.println("Camera Man Name : "+cameraManName);
		
		
		if(location!=null)
		{
			System.out.println("\nThe location of Shooting is valid ");
		}
		else
		{
			System.out.println("The location is invalid");
			return;
		}
		if(date!=null)
		{
			System.out.println("The date of Shooting is  valid");
		}
		else
		{
			System.out.println("The date is invalid");
			return;
		}
		if(howManyPeople>3)
		{
			System.out.println("The no of people in  Shooting is  valid");
		}
		else
		{
			System.out.println("The no of people is invalid");
			return;
		}
		
		if(resolution>=48)
		{
			System.out.println("The resolution value is  valid");
		}
		else{
			System.out.println("The resolution value is In-valid");
			return;
		}
		
		if(clarity!=null)
		{
			System.out.println("The clarity of photo is pointing to meamory");
		}
		else
		{
			System.out.println("The clarity of photo is not pointing to meamory");
			return;
		}
		if(cameraManName!=null)
		{
			System.out.println("The camera man name is valid");
		}
		else
		{
			System.out.println("The ccamera man name is invalid");
			return;
		}
		System.out.println("All parameters are valid \n");
		}
		
		
}