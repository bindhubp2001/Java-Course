class Police{
	String type;
	String gender;
	int badgrNumber;
		
	Police()
	{
		System.out.println("Calling Dafault Constuuctor");
		System.out.println("TYPE of Police: "+this.type);
		System.out.println("gender : "+this.gender);
		System.out.println("badgrNumber : "+this.badgrNumber);
		this.type="Traffic";
		this.gender="Female";
		this.badgrNumber = 10;
		
	}
	Police(String type,String gender,int badgrNumber)
	{
		System.out.println("Calling Parameterized Constuuctor");
		this.type=type;
		this.gender=gender;
		this.badgrNumber=badgrNumber;
	}

}