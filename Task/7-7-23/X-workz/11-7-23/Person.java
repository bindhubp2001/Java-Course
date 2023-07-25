class Person
{
	static byte getAgeByName(String name)
	{
		if(name!=null)
			System.out.println("\nName is Valid");
		{
			if(name == "Anu")
			{
				return 25;
			}
			if(name == "Bhanu")
			{
				return 27;
			}
			if(name == "Chandu")
			{
				return 22;
			}
			if(name == "Dhoni")
			{
				return 42;
			}
			if(name == "Endhu")
			{
				return 12;
			}
			if(name == "fathima")
			{
				return 13;
			}
			if(name == "Ghanavi")
			{
				return 45;
			}
			if(name == "Hindhu")
			{
				return 16;
			}
			if(name == "Indhu")
			{
				return 89;
			}
			if(name == "Janaki")
			{
				return 20;
			}
		}
		else
		{
			return  0;
		}
		return 1;
	}
	
}