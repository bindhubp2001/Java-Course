class Baker{
	static void cooking(String foodItem,byte noOfPeople,double exp,byte duration,boolean assistent){
		
		System.out.println("\nName of Food : "+foodItem);
		System.out.println("No of Working People : "+noOfPeople);
		System.out.println("Years of Experience  : "+exp);
		System.out.println("Time taken to Complete cooking: "+duration);
		System.out.println("Has Assistance : "+assistent);
		
		if(foodItem!=null)
		{
			System.out.println("\nFood Name is pointing to memory");
		}
		else
		{
			System.out.println("Food Name is not pointing to memory");
			return;
		}
		if(noOfPeople>1)
		{
			System.out.println("No Of People is valid");
		}
		else
		{
			System.out.println("No Of People is not valid");
			return;
		}
		if(exp>1.5)
		{
			System.out.println("Experience is pointing to memory");
		}
		else
		{
			System.out.println("Experience is not pointing to memory");
			return;
		}
		if(duration>1)
		{
			System.out.println("Duration is Valid");
		}
		else
		{
			System.out.println("Duration is not Valid");
			return;
		}
		if(assistent==true)
		{
			System.out.println("Assitent is there");
		}
		else
		{
			System.out.println("Assitent is not there");
			return;
		}
		System.out.println("All Arguments are Valid");
	
		
		
	}
}