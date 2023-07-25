class Stove
{
    static void cook(String brand,int noOfBurner,float price,String type){
		
		System.out.println("\nBrand : "+brand);
		System.out.println("Number of Burner : "+noOfBurner);
		System.out.println("Price : "+price);
		System.out.println("Type of Stove : "+type);
	  
	  if(brand!=null)
	  {
		  System.out.println("\nThe brand is pointing to memory");
	  }
	  else
	  {
		  System.out.println("The brand is not pointing to memory ");
		  return;
	  }
	   if(noOfBurner>=1)
	  {
		  System.out.println("The no of burners of the stove is valid");
	  }
	  else
	  {
		  System.out.println("The no of burners of the stove is invalid");
		  return;
	  }
	   if(price>=5000)
	  {
		  System.out.println("The price of the stove is valid");
	  }
	  else
	  {
		  System.out.println("The price of the stove is invalid");
		  return;
	  }
	   if(type!=null)
	  {
		  System.out.println("The type of the stove is pointing to memory");
	  }
	  else
	  {
		  System.out.println("The type of the stove is not pointing to memory");
		  return;
	  }
	  System.out.println("All Arguments are valid");
	  
	  
  }
}