class PersonEmail{
	static String getEmailByName(String name)
	{
		if(name!=null)
			System.out.println("\nName is Valid");
		{
			if(name == "Anu")
			{
				return "anu@gmail.com";
			}
			if(name == "Bhanu")
			{
				return "bhanu@gmail.com";
			}
			if(name == "Chandu")
			{
				return "chandu@gmail.com";
			}
			if(name == "Dhoni")
			{
				return "dhoni@gmail.com";
			}
			if(name == "Endhu")
			{
				return "endhu@gmail.com";
			}
			if(name == "fathima")
			{
				return "fathima@gmail.com";
			}
			if(name == "Ghanavi")
			{
				return "ganavi@gmail.com";
			}
			if(name == "Hindhu")
			{
				return "hindhu@gmail.com";
			}
			if(name == "Indhu")
			{
				return "indhu@gmail.com";
			}
			if(name == "Janaki")
			{
				return "janaki@gmail.com";
			}
		}
		else
		{
			return "In-Valid";
		}
		return "NA";
	}
}