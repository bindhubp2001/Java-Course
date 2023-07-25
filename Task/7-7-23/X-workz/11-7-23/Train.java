class Train
{
	static String trainName(int trainNumber)
	{
		if(trainNumber!=0)
			System.out.println("\ntrainNumber is Valid");
		{
			if(trainNumber==11013)
			{
				return "COIMBATORE EXPRESS";
			}
			if(trainNumber==11014)
			{
				return "LOKMANYA TT EXP";
			}
			if(trainNumber==12134)
			{
				return "Mumbai Express ";
			}
			
			if(trainNumber==22691)
			{
				return "RAJDHANI EXP";
			}
		}
		else
		{
			return "INVALID";
		}
	
	return "NA";
	}
}