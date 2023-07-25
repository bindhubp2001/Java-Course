class WeighingMachine{

	static void measure(String brand,String type,int limitInKg,double price){
	
		System.out.println("\nBrand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("Limit in Kg : "+limitInKg);
		System.out.println("Price : "+price);
		
	
		if(brand!=null)
		{
			System.out.println("\nThe brand of the WeighingMachine is poimting to memory");
		}
		else
		{
			System.out.println("The brand is not pointing to memory");
			return;
			
		}
		if(type!=null)
		{
			System.out.println("The type of the WeighingMachine is poimting to memory");
		}
		else
		{
			System.out.println("The type is not valid is not poimting to memory");
			return;
			
		}
		if(limitInKg>=100)
		{
			System.out.println("The limit of the WeighingMachine is Valid ");
		}
		else
		{
			System.out.println("The limit is not valid:");
			return;
			
		}
		if(price>1000)
		{
			System.out.println("The price of the WeighingMachine is Pointing to memory");
		}
		else
		{
			System.out.println("The price is not pointing to memory");
			return;
			
		}
		System.out.println("All are valid");
}

}