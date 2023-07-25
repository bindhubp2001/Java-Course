class Engine{
	static int getCcByModel(String model){
		if(model!=null){
			System.out.println("Model is Valid");
			if(model == "Swift")
			{
				return 1197;
			}
			if(model == "Rapid")
			{
				return 1498;
			}
			if(model == "BMW")
			{
				return 2998;
			}
			if(model == "Audi")
			{
				return 1998;
			}
			if(model == "Benz")
			{
				return 1993;
			}
			if(model == "Bently")
			{
				return 3993;
			}
		}
		else{
			System.err.println("Model is IN-Valid");
			return 1;
		}
		
		return 0;
	}
}