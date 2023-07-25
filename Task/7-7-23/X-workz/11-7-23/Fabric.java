class Fabric{
	static float getPrice(String name){
		if(name!=null)
		{
			System.out.println("\nName is Valid");
			if(name == "Cotton")
			{
				return 999f;
			}
			if(name == "Nylon")
			{
				return 149f;
			}
			if(name == "polyster")
			{
				return 299f;
			}
			if(name == "Linen")
			{
				return 499f;
			}
			if(name == "silk")
			{
				return 3999f;
			}
			if(name == "woolen")
			{
				return 5999f;
			}
		}
		else{
			
			return 0f;
		}
		
		return 1f;
	}
}