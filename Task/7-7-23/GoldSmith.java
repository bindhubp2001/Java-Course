class GoldSmith{
	
	static void work(String name,int caret,int exp,double price){
		
		System.out.println("\nName : "+name);
		System.out.println("Caret : "+caret);
		System.out.println("Experience : "+exp);
		System.out.println("Price : "+price);
		
		
		if(name!=null)
		{
			System.out.println("\nhe name of the GoldSmith is pointing to valid");
		}
		else
		{
			System.out.println("The name of the GoldSmith is not pointing to valid");
			return;
		}
		if(caret<=24)
		{
			System.out.println("The caret of Gold used by GoldSmith is valid");
		}
		else
		{
			System.out.println("the name of Gold used by GoldSmith is invalid");
			return;
		}
		if(exp>=1)
		{
			System.out.println("The experience of the GoldSmith is valid");
		}
		else
		{
			System.out.println("the experience of the GoldSmith is invalid");
			return;
		}
		if(price>=25000)
		{
			System.out.println("The price of the Gold made by GoldSmith is valid");
		}
		else
		{
			System.out.println("the price of the Gold made by GoldSmith is invalid");
			return;
		}
		System.out.println("All Given Arguments are Valid");
	}
}