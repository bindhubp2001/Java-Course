class Helmet
{
	String name;
	String material;
	static double price;
	static int quantity;
	
	Helmet()
	{
		
		this.material="polycarbonate plastic";
		this.name="vega";
	}
	
	void helmateInstanceMethod()
	{
		System.out.println("NAME : "+name);
		System.out.println("MATERIAL : "+material);
	}	

	static void helmateStaticMethod(){
		System.out.println("Price : "+price);
		System.out.println("QUANTITY : "+quantity);
	}
	static
	{
		
		price=799;
		quantity=2;
		
	}
	
	
}