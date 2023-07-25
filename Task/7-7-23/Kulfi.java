class Kulfi{

	static void candy(String flavour,int quantity, double price){
		
		System.out.println("\n Flavour : "+flavour);
		System.out.println("Quantity : "+quantity);
		System.out.println("Price : "+price);
		
		if(flavour!=null)
		{
			System.out.println("\nThe flavour of the Kulfi is pointing to memory");
		}
		else
		{
			System.out.println("The falvour of the Kulfi is not pointing to memory");
			return;
		}
		if(quantity>3)
		{
			System.out.println("The quantity is valid");
		}
		else
		{
			System.out.println("The quantity is InValid");
			return;
		}
		if(price>=10)
		{
			System.out.println("The price of the Kulfi is valid");
		}
		else
		{
			System.out.println("The price of Kulfi the is inValid");
			return;
		}
		System.out.println("All parameters are valid");
		}


}