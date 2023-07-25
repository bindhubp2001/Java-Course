class Oven{
	
	static void heatsFood(String brand,int noOfColumns,double cost,boolean smart){
		
		System.out.println("\nBrand : "+brand);
		System.out.println("Number of Columns : "+noOfColumns);
		System.out.println("Price : "+cost);
		System.out.println("Is smart : "+smart);
		
		if(brand!=null)
		{
			System.out.println("\nBrand of oven is pointing to memory");
		}
		else
		{
			System.out.println("Brand of oven is not pointing to memory");
			return;
		}
		if(noOfColumns>1)
		{
			System.out.println("No.of columns in  oven is Valid");
		}
		else
		{
			System.out.println("No.of columns in  oven is not valid");
			return;
		}
		if(cost>5000)
		{
			System.out.println("price of oven oven is Valid");
		}
		else
		{
			System.out.println("Price of oven is not valid");
			return;
		}
		if(smart=true)
		{
			System.out.println("Oven is connected to mobile");
		}
		else
		{
			System.out.println("Oven is not connected to mobile");
			return;
		}
		System.out.println("All Are Valid");
	}

}