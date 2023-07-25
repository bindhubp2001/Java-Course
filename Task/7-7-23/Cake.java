class Cake{
	static void tasty(String name,String type,String bakeryName,double price,int noOfPieces,String ocassion){
		
		System.out.println("\nName of Cake : "+name);
		System.out.println("Type of Cake : "+type);
		System.out.println("Bakery Name  : "+bakeryName);
		System.out.println("Price of Cake: "+price);
		System.out.println("No Of Pieces : "+noOfPieces);
		System.out.println("Ocassion : "+ocassion);kcx
		if(name!=null)
		{
			System.out.println("\nName is pointing to memory");
		}
		else
		{
			System.out.println("Name is not pointing to memory");
			return;
		}
		if(type!=null)
		{
			System.out.println("Type is pointing to memory");
		}
		else
		{
			System.out.println("Type is not pointing to memory");
			return;
		}
		if(bakeryName!=null)
		{
			System.out.println("Bekary Name is pointing to memory");
		}
		else
		{
			System.out.println("Bakery Name is not pointing to memory");
			return;
		}
		if(price>=15)
		{
			System.out.println("Price is Valid");
		}
		else
		{
			System.out.println("Price is In-Valid");
			return;
		}
		if(noOfPieces>=2)
		{
			System.out.println("No Of Pieces is Valid");
		}
		else
		{
			System.out.println("No Of Pieces is In-Valid");
			return;
		}
		if(ocassion!=null)
		{
			System.out.println("Ocassion is pointing to memory");
		}
		else
		{
			System.out.println("Ocassion is not pointing to memory");
			return;
		}
		System.out.println("All Arguments are Given Correctly");
	}
}